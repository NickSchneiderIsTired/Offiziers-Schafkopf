package game.util;

public class Position {
	
	private int x, y;
	public static Position p1 = new Position(120, 80);
	public static Position p2 = new Position(120, 340);
	public static Position p3 = new Position(120, 600);
	public static Position p4 = new Position(120, 860);
	
	public static Position p5 = new Position(490, 80);
	public static Position p6 = new Position(490, 340);
	public static Position p7 = new Position(490, 600);
	public static Position p8 = new Position(490, 860);
	
	public static Position p9 = new Position(1920 - 750, 80);
	public static Position p10 = new Position(1920 - 750, 340);
	public static Position p11 = new Position(1920 - 750, 600);
	public static Position p12 = new Position(1920 - 750, 860);
	
	public static Position p13 = new Position(1920 - 370, 80);
	public static Position p14 = new Position(1920 - 370, 340);
	public static Position p15 = new Position(1920 - 370, 600);
	public static Position p16 = new Position(1920 - 370, 860);
	
	public static Position p17 = new Position(110, 80);
	public static Position p18 = new Position(110, 340);
	public static Position p19 = new Position(110, 600);
	public static Position p20 = new Position(110, 860);
	
	public static Position p21 = new Position(480, 80);
	public static Position p22 = new Position(480, 340);
	public static Position p23 = new Position(480, 600);
	public static Position p24 = new Position(490, 860);
	
	public static Position p25 = new Position(1920 - 740, 80);
	public static Position p26 = new Position(1920 - 740, 340);
	public static Position p27 = new Position(1920 - 740, 600);
	public static Position p28 = new Position(1920 - 740, 860);
	
	public static Position p29 = new Position(1920 - 360, 80);
	public static Position p30 = new Position(1920 - 360, 340);
	public static Position p31 = new Position(1920 - 360, 600);
	public static Position p32 = new Position(1920 - 360, 860);
	
	
	public static Position played1 = new Position(820, 360);
	public static Position played2 = new Position(820, 560);
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
