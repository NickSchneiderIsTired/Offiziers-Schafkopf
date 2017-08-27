package game;

import game.input.Keyboard;
import game.util.Positions;

public class Game {

	private Deck deck;
	private Card[] unplayedCards;
	private Card[] playedCards;
	private Screen screen;
	private Positions positions;
	private int pPosCounter = 0;
	private Keyboard keys;
	public int player1score = 0;
	public int player2score = 0;
	public int playedStiche = 0;
	public int playerTurn = 1;

	public Game(Deck d, Screen s, Keyboard key) {
		unplayedCards = new Card[32];
		playedCards = new Card[2];
		deck = d;
		screen = s;
		positions = new Positions();
		keys = key;
		drawNewGame();
	}
	
	public void reset() {
		playedStiche = 0;
		player1score = 0;
		player2score = 0;
		pPosCounter = 0;
		drawNewGame();
	}

	
	public void render() {
		renderLowerPlayedCard();
		renderUpperPlayedCard();
		renderUnplayedCards();
	}

	public void renderUpperPlayedCard() {
		if (playedCards[0] != null) {
			screen.renderCard(playedCards[0], positions.playedPosition[0].getX(), positions.playedPosition[0].getY());
		}
	}

	public void renderLowerPlayedCard() {
		if (playedCards[1] != null) {
			screen.renderCard(playedCards[1], positions.playedPosition[1].getX(), positions.playedPosition[1].getY());
		}

	}

	public void renderUnplayedCards() {
		for (int i = unplayedCards.length - 1; i >= 0; i--) {
			if (unplayedCards[i] != null) {
				screen.renderCard(unplayedCards[i], positions.positions[i].getX(), positions.positions[i].getY());
			}
		}
	}

	public void drawNewGame() {
		// while(deck.getSize() != 0) {
		deck.refill();
		for (int i = 0; i < unplayedCards.length; i++) {
			unplayedCards[i] = deck.drawCard();
		}
		// }
	}

	public void playCard(int i) {
		// unplayedCards[i].setPlayed(true);
		pPosCounter++;
		if (pPosCounter % 2 == 0) {
			playedCards[0] = unplayedCards[i];
		} else {
			playedCards[1] = unplayedCards[i];
		}
		unplayedCards[i] = null;
	}

	boolean available = true;
	int keyCounter = 0;

	int moveCounter = 0;

	public int checkPlayer() {
		if (moveCounter % 2 == 0) {
			return 1;
		} else {
			return 2;
		}
	}

	private void addToPlayer1() {
		playedStiche++;
		player1score += playedCards[0].getValue();
		player1score += playedCards[1].getValue();
		playedCards[0] = null;
		playedCards[1] = null;
	}

	private void addToPlayer2() {
		playedStiche++;
		player2score += playedCards[0].getValue();
		player2score += playedCards[1].getValue();
		playedCards[0] = null;
		playedCards[1] = null;
	}

	/*
	 * Both Methods first check if the key-timer is ready for next press. Then
	 * it checks if there is 2 cards on top of each other and if so play the top
	 * one Otherwise play the bottom one. This happens for keys 1-8
	 * 
	 * The 2 methods separate the 8 cards on the left from the ones on the right
	 * (player 1 and 2)
	 */

	private void playerOneAction() {
		if (keys.k1 && available) {
			if (unplayedCards[0] != null) {
				playCard(0);
				moveCounter++;
			} else if (unplayedCards[16] != null) {
				playCard(16);
				moveCounter++;
			}
			available = false;
		} else if (keys.k2 && available) {
			if (unplayedCards[1] != null) {
				playCard(1);
				moveCounter++;
			} else if (unplayedCards[17] != null) {
				playCard(17);
				moveCounter++;
			}
			available = false;
		} else if (keys.k3 && available) {
			if (unplayedCards[2] != null) {
				playCard(2);
				moveCounter++;
			} else if (unplayedCards[18] != null) {
				playCard(18);
				moveCounter++;
			}
			available = false;
		} else if (keys.k4 && available) {
			if (unplayedCards[3] != null) {
				playCard(3);
				moveCounter++;
			} else if (unplayedCards[19] != null) {
				playCard(19);
				moveCounter++;
			}
			available = false;
		} else if (keys.k5 && available) {
			if (unplayedCards[4] != null) {
				playCard(4);
				moveCounter++;
			} else if (unplayedCards[20] != null) {
				playCard(20);
				moveCounter++;
			}
			available = false;
		} else if (keys.k6 && available) {
			if (unplayedCards[5] != null) {
				playCard(5);
				moveCounter++;
			} else if (unplayedCards[21] != null) {
				playCard(21);
				moveCounter++;
			}
			available = false;
		} else if (keys.k7 && available) {
			if (unplayedCards[6] != null) {
				playCard(6);
				moveCounter++;
			} else if (unplayedCards[22] != null) {
				playCard(22);
				moveCounter++;
			}
			available = false;
		} else if (keys.k8 && available) {
			if (unplayedCards[7] != null) {
				playCard(7);
				moveCounter++;
			} else if (unplayedCards[23] != null) {
				playCard(23);
				moveCounter++;
			}
			available = false;
		} else if (!available) {
			keyCounter++;
			if (keyCounter % 30 == 0) {
				available = true;
				keyCounter = 1;
			}
		}

	}

	private void playerTwoAction() {
		if (keys.k1 && available) {
			if (unplayedCards[8] != null) {
				playCard(8);
				moveCounter++;
			} else if (unplayedCards[24] != null) {
				playCard(24);
				moveCounter++;
			}
			available = false;
		} else if (keys.k2 && available) {
			if (unplayedCards[9] != null) {
				playCard(9);
				moveCounter++;
			} else if (unplayedCards[25] != null) {
				playCard(25);
				moveCounter++;
			}
			available = false;
		} else if (keys.k3 && available) {
			if (unplayedCards[10] != null) {
				playCard(10);
				moveCounter++;
			} else if (unplayedCards[26] != null) {
				playCard(26);
				moveCounter++;
			}
			available = false;
		} else if (keys.k4 && available) {
			if (unplayedCards[11] != null) {
				playCard(11);
				moveCounter++;
			} else if (unplayedCards[27] != null) {
				playCard(27);
				moveCounter++;
			}
			available = false;
		} else if (keys.k5 && available) {
			if (unplayedCards[12] != null) {
				playCard(12);
				moveCounter++;
			} else if (unplayedCards[28] != null) {
				playCard(28);
				moveCounter++;
			}
			available = false;
		} else if (keys.k6 && available) {
			if (unplayedCards[13] != null) {
				playCard(13);
				moveCounter++;
			} else if (unplayedCards[29] != null) {
				playCard(29);
				moveCounter++;
			}
			available = false;
		} else if (keys.k7 && available) {
			if (unplayedCards[14] != null) {
				playCard(14);
				moveCounter++;
			} else if (unplayedCards[30] != null) {
				playCard(30);
				moveCounter++;
			}
			available = false;
		} else if (keys.k8 && available) {
			if (unplayedCards[15] != null) {
				playCard(15);
				moveCounter++;
			} else if (unplayedCards[31] != null) {
				playCard(31);
				moveCounter++;
			}
			available = false;
		} else if (!available) {
			keyCounter++;
			if (keyCounter % 30 == 0) {
				available = true;
				keyCounter = 1;
			}
		}
	}

	public void update() {
		if (checkPlayer() == 1) {
			playerOneAction();
		} else {
			playerTwoAction();
		}
		if (keys.q && available && playedCards[0] != null && playedCards[0] != null) {
			moveCounter = 0;
			addToPlayer1();
		}
		if (keys.p && available && playedCards[0] != null && playedCards[0] != null) {
			moveCounter = 1;
			addToPlayer2();
		}
		if(keys.enter && available && playedStiche == 16) {
			reset();
		}
	}
	
}
