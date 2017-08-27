package game.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {
	
	public String path;
	public final int WIDTH;
	public final int HEIGHT;
	public int[] pixels;
	
	public static Spritesheet cardSheet = new Spritesheet("/sheets/cardSheetTurned.png", 1000,1120);
	
	public Spritesheet(String path, int width, int height) {
		this.path = path;
		this.WIDTH = width;
		this.HEIGHT = height;
		pixels = new int[width * height];
		load();
	}
	
	private void load() {
		try {
			System.out.println(path);
			BufferedImage image = ImageIO.read(this.getClass().getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
