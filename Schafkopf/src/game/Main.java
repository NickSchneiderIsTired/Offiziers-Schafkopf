package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JButton;
import javax.swing.JFrame;

import game.input.Keyboard;

public class Main extends JFrame implements Runnable {
	private static final long serialVersionUID = 1L;
	
	public Deck deck;

	private Thread thread;
	private JFrame frame;
	private boolean running = false;
	private static int width = 1920;
	private static int height = 1080;
	private static int scale = 1;

	private BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	private int[] pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();

	private Screen screen;
	private Game game;
	private Keyboard keys;

	public Main() {
		Dimension size = new Dimension(width * scale, height * scale);
		setPreferredSize(size);
		frame = this;
		setUndecorated(true);
		screen = new Screen(width, height);
		deck = new Deck();
		keys = new Keyboard();
		game = new Game(deck, screen, keys);
		
		addKeyListener(keys);
	}

	public synchronized void start() {
		running = true;
		thread = new Thread(this, "Main");
		thread.start();
	}

	public synchronized void stop() {
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		long last = System.nanoTime();
		double ns = 1000000000.0 / 60.0;
		double delta = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - last) / ns;
			last = now;
			while (delta >= 1) {
				update();
				delta--;
			}
			render();
		}
		stop();
	}

	public void render() {
		BufferStrategy bs = getBufferStrategy();
		if (bs == null) {
			createBufferStrategy(3);
			return;
		}

		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = screen.pixels[i];
		}
		
		screen.drawBg();
		game.render();
		
		Graphics g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
		g.setColor(Color.blue);
		g.setFont(new Font("Arial", Font.BOLD, 200));
		
		if(game.playedStiche == 16) {
			g.drawString(game.player1score + " : " + game.player2score, 750, 600);
		}
		
		g.dispose();
		bs.show();
	}

	public void update() {
		keys.update();
		if(keys.esc) {
			System.exit(0);
		}
		game.update();
	}

	public static void main(String[] args) {
		Main game = new Main();
		game.setResizable(false);
		game.setVisible(true);

		game.setTitle("Schafkopf");
		game.pack();
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setLocationRelativeTo(null);

		game.start();

	}
}
