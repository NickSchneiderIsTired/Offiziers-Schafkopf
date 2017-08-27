package game;

import game.graphics.Sprite;

public class Card {

	private int value;
	private String color;
	private String name;
	private boolean trump;
	public boolean played;
	public int width;
	public int height;
	public Sprite sprite;
	
	public int[] pixels;

	public static Card eichel_ass = new Card(11, "eichel", "ass", false, Sprite.eichel_ass, false);
	public static Card eichel_koenig = new Card(4, "eichel", "koenig", false, Sprite.eichel_koenig, false);
	public static Card eichel_ober = new Card(3, "eichel", "ober", true, Sprite.eichel_ober, false);
	public static Card eichel_unter = new Card(2, "eichel", "unter", true, Sprite.eichel_unter, false);
	public static Card eichel_zehn = new Card(10, "eichel", "zehn", false, Sprite.eichel_zehn, false);
	public static Card eichel_neun = new Card(0, "eichel", "neun", false, Sprite.eichel_neun, false);
	public static Card eichel_acht = new Card(0, "eichel", "acht", false, Sprite.eichel_acht, false);
	public static Card eichel_sieben = new Card(0, "eichel", "sieben", false, Sprite.eichel_sieben, false);
	public static Card laub_ass = new Card(11, "laub", "ass", false, Sprite.laub_ass, false);
	public static Card laub_koenig = new Card(4, "laub", "koenig", false, Sprite.laub_koenig, false);
	public static Card laub_ober = new Card(3, "laub", "ober", true, Sprite.laub_ober, false);
	public static Card laub_unter = new Card(2, "laub", "unter", true, Sprite.laub_unter, false);
	public static Card laub_zehn = new Card(10, "laub", "zehn", false, Sprite.laub_zehn, false);
	public static Card laub_neun = new Card(0, "laub", "neun", false, Sprite.laub_neun, false);
	public static Card laub_acht = new Card(0, "laub", "acht", false, Sprite.laub_acht, false);
	public static Card laub_sieben = new Card(0, "laub", "sieben", false, Sprite.laub_sieben, false);
	public static Card herz_ass = new Card(11, "herz", "ass", true, Sprite.herz_ass, false);
	public static Card herz_koenig = new Card(4, "herz", "koenig", true, Sprite.herz_koenig, false);
	public static Card herz_ober = new Card(3, "herz", "ober", true, Sprite.herz_ober, false);
	public static Card herz_unter = new Card(2, "herz", "unter", true, Sprite.herz_unter, false);
	public static Card herz_zehn = new Card(10, "herz", "zehn", true, Sprite.herz_zehn, false);
	public static Card herz_neun = new Card(0, "herz", "neun", true, Sprite.herz_neun, false);
	public static Card herz_acht = new Card(0, "herz", "acht", true, Sprite.herz_acht, false);
	public static Card herz_sieben = new Card(0, "herz", "sieben", true, Sprite.herz_sieben, false);
	public static Card schell_ass = new Card(11, "schell", "ass", false, Sprite.schell_ass, false);
	public static Card schell_koenig = new Card(4, "schell", "koenig", false, Sprite.schell_koenig, false);
	public static Card schell_ober = new Card(3, "schell", "ober", true, Sprite.schell_ober, false);
	public static Card schell_unter = new Card(2, "schell", "unter", true, Sprite.schell_unter, false);
	public static Card schell_zehn = new Card(10, "schell", "zehn", false, Sprite.schell_zehn, false);
	public static Card schell_neun = new Card(0, "schell", "neun", false, Sprite.schell_neun, false);
	public static Card schell_acht = new Card(0, "schell", "acht", false, Sprite.schell_acht, false);
	public static Card schell_sieben = new Card(0, "schell", "sieben", false, Sprite.schell_sieben, false);
	
	
	public Card(int w, String f, String n, boolean t, Sprite s) {
		value = w;
		color = f;
		name = n;
		trump = t;
		width = 250;
		height = 140;
		sprite = s;
		pixels = new int[width * height];
	}

	public Card(int w, String f, String n, boolean t, Sprite s, boolean played) {
		value = w;
		color = f;
		name = n;
		trump = t;
		width = 250;
		height = 140;
		sprite = s;
		this.played = played;
		pixels = new int[width * height];
	}
	
	public void setPlayed(boolean played) {
		this.played = played;
	}
	
	public int getValue() {
		return value;
	}

	public String getFarbe() {
		return color;
	}

	public String getName() {
		return name;
	}
	
	public boolean isTrumpf() {
		return trump;
	}
}
