package game.graphics;

public class Sprite {

	private final int WIDTH;
	private final int HEIGHT;
	private int x,y;
	public int[] pixels;
	public Spritesheet sheet;
	
	public static Sprite eichel_sieben = new Sprite(250, 140, 0, 0, Spritesheet.cardSheet);
	public static Sprite eichel_acht = new Sprite(250, 140, 0, 1, Spritesheet.cardSheet);
	public static Sprite eichel_neun = new Sprite(250, 140, 0, 2, Spritesheet.cardSheet);
	public static Sprite eichel_zehn = new Sprite(250, 140, 0, 3, Spritesheet.cardSheet);
	public static Sprite eichel_unter = new Sprite(250, 140, 0, 4, Spritesheet.cardSheet);
	public static Sprite eichel_ober = new Sprite(250, 140, 0, 5, Spritesheet.cardSheet);
	public static Sprite eichel_koenig = new Sprite(250, 140, 0, 6, Spritesheet.cardSheet);
	public static Sprite eichel_ass = new Sprite(250, 140, 0, 7, Spritesheet.cardSheet);
	
	public static Sprite laub_sieben = new Sprite(250, 140, 1, 0, Spritesheet.cardSheet);
	public static Sprite laub_acht = new Sprite(250, 140, 1, 1, Spritesheet.cardSheet);
	public static Sprite laub_neun = new Sprite(250, 140, 1, 2, Spritesheet.cardSheet);
	public static Sprite laub_zehn = new Sprite(250, 140, 1, 3, Spritesheet.cardSheet);
	public static Sprite laub_unter = new Sprite(250, 140, 1, 4, Spritesheet.cardSheet);
	public static Sprite laub_ober = new Sprite(250, 140, 1, 5, Spritesheet.cardSheet);
	public static Sprite laub_koenig = new Sprite(250, 140, 1, 6, Spritesheet.cardSheet);
	public static Sprite laub_ass = new Sprite(250, 140, 1, 7, Spritesheet.cardSheet);
	
	public static Sprite schell_sieben = new Sprite(250, 140, 2, 0, Spritesheet.cardSheet);
	public static Sprite schell_acht = new Sprite(250, 140, 2, 1, Spritesheet.cardSheet);
	public static Sprite schell_neun = new Sprite(250, 140, 2, 2, Spritesheet.cardSheet);
	public static Sprite schell_zehn = new Sprite(250, 140, 2, 3, Spritesheet.cardSheet);
	public static Sprite schell_unter = new Sprite(250, 140, 2, 4, Spritesheet.cardSheet);
	public static Sprite schell_ober = new Sprite(250, 140, 2, 5, Spritesheet.cardSheet);
	public static Sprite schell_koenig = new Sprite(250, 140, 2, 6, Spritesheet.cardSheet);
	public static Sprite schell_ass = new Sprite(250, 140, 2, 7, Spritesheet.cardSheet);
	
	public static Sprite herz_sieben = new Sprite(250, 140, 3, 0, Spritesheet.cardSheet);
	public static Sprite herz_acht = new Sprite(250, 140, 3, 1, Spritesheet.cardSheet);
	public static Sprite herz_neun = new Sprite(250, 140, 3, 2, Spritesheet.cardSheet);
	public static Sprite herz_zehn = new Sprite(250, 140, 3, 3, Spritesheet.cardSheet);
	public static Sprite herz_unter = new Sprite(250, 140, 3, 4, Spritesheet.cardSheet);
	public static Sprite herz_ober = new Sprite(250, 140, 3, 5, Spritesheet.cardSheet);
	public static Sprite herz_koenig = new Sprite(250, 140, 3, 6, Spritesheet.cardSheet);
	public static Sprite herz_ass = new Sprite(250, 140, 3, 7, Spritesheet.cardSheet);
	
	
	public Sprite(int w, int h, int x, int y, Spritesheet sheet) {
		WIDTH = w;
		HEIGHT = h;
		pixels = new int[w * h];
		this.x = x * w;
		this.y = y * h;
		this.sheet = sheet;
		load();
	}
	
	public void load() {
		for(int y = 0; y < HEIGHT; y++) {
			for(int x = 0; x < WIDTH; x++) {
				pixels[x + y * WIDTH] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.WIDTH];
			}
		}
	}
	
	public int getHeight() {
		return HEIGHT;
	}
	
	public int getWidth() {
		return WIDTH;
	}
	
}
