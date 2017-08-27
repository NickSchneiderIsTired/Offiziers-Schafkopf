package game;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	public ArrayList<Card> cards;
	private int size;
	private Random random = new Random();
	
	public Deck() {
		size = 32;
		cards = new ArrayList<Card>();
		refill();
	}
	
	
	public Card drawCard() {
		int rdm = random.nextInt(size);
		System.out.println(rdm);
		Card drawnCard = cards.get(rdm);
		cards.remove(rdm);
		size--;
		return drawnCard;
	}
	
	public void refill() {
		size = 32;
		cards.clear();
		cards.add(Card.eichel_acht);
		cards.add(Card.eichel_sieben);
		cards.add(Card.eichel_neun);
		cards.add(Card.eichel_zehn);
		cards.add(Card.eichel_unter);
		cards.add(Card.eichel_ober);
		cards.add(Card.eichel_koenig);
		cards.add(Card.eichel_ass);
		
		cards.add(Card.laub_sieben);
		cards.add(Card.laub_acht);
		cards.add(Card.laub_neun);
		cards.add(Card.laub_zehn);
		cards.add(Card.laub_unter);
		cards.add(Card.laub_ober);
		cards.add(Card.laub_koenig);
		cards.add(Card.laub_ass);
		
		cards.add(Card.herz_sieben);
		cards.add(Card.herz_acht);
		cards.add(Card.herz_neun);
		cards.add(Card.herz_zehn);
		cards.add(Card.herz_unter);
		cards.add(Card.herz_ober);
		cards.add(Card.herz_koenig);
		cards.add(Card.herz_ass);
		
		cards.add(Card.schell_sieben);
		cards.add(Card.schell_acht);
		cards.add(Card.schell_neun);
		cards.add(Card.schell_zehn);
		cards.add(Card.schell_unter);
		cards.add(Card.schell_ober);
		cards.add(Card.schell_koenig);
		cards.add(Card.schell_ass);
		
	}
	
	public int getSize() {
		return size;
	}
	
}
