package WAR;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;

	public Player(String name) {
		score = 0;
		this.name = name;
	}

	public void describe() {
		System.out.println("Name: " + name);
		for (Card card : hand) {
			card.describe();
		}
	}

	public Card flip() {
		Card card = hand.get(0);
		hand.remove(0);
		return card;
	}

	public void draw(Deck deck) {
		hand.add(deck.draw());
	}

	public void incrementScore() {
		score++;
	}

	public int getScore() {
		return score;
	}

}
