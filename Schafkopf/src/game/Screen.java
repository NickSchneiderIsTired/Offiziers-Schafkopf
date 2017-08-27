package game;

import game.graphics.Sprite;

public class Screen {

	public int width;
	public int height;
	public int[] pixels;

	public Screen(int w, int h) {
		width = w;
		height = h;
		pixels = new int[w * h];
	}

	public void clear() {
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}

	public void drawBg() {
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				pixels[x + y * width] = 0x36b542;
			}
		}
	}
	
	public void renderCard(Card c, int xPos, int yPos) {
		for (int x = 0; x < c.sprite.getWidth(); x++) {
			for (int y = 0; y < c.sprite.getHeight(); y++) {
				pixels[(x + xPos) + (y + yPos) * width] = c.sprite.pixels[x + y * c.sprite.getWidth()];
			}
		}
	}

}
