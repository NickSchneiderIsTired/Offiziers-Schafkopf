package game.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener{

	public boolean[] keys= new boolean[120];
	public boolean k1,k2,k3,k4,k5,k6,k7,k8,q,p, enter, esc;
	
	public void update() {
		k1 = keys[KeyEvent.VK_1];
		k2 = keys[KeyEvent.VK_2];
		k3 = keys[KeyEvent.VK_3];
		k4 = keys[KeyEvent.VK_4];
		k5 = keys[KeyEvent.VK_5];
		k6 = keys[KeyEvent.VK_6];
		k7 = keys[KeyEvent.VK_7];
		k8 = keys[KeyEvent.VK_8];
		q = keys[KeyEvent.VK_Q];
		p = keys[KeyEvent.VK_P];
		enter = keys[KeyEvent.VK_ENTER];
		esc = keys[KeyEvent.VK_ESCAPE];
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
