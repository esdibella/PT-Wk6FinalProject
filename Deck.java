package WAR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<Card>();

	private final String[] suits = { "Hearts", "Diamonds", "Spades", "Clubs" };

	private final String[] faceNames = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
			"Queen", "King", "Ace" };

	public Deck() {
		for (String suit : suits) {
			for (int value = 2; value <= 14; value++) {
				cards.add(cardGivenSuitsAndValue(suit, value));
			}
		}
	}

	public Card draw() {
		Card card = cards.get(0);
		cards.remove(0);
		return card;
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	private Card cardGivenSuitsAndValue(String suit, int value) {
		Card card = new Card();
		card.setValue(value);
		card.setName(faceNames[value - 2] + " of " + suit);
		return card;
		
	}
}
