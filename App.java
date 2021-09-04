package WAR;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");

		deck.shuffle();

		for (int i = 0; i < 52; i++) {
			if ((i % 2) == 0) {
				player2.draw(deck);
			} else {
				player1.draw(deck);
			}
		}

		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();

			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
			} else if (card2.getValue() > card1.getValue()) {
				player2.incrementScore();
			} else {
				// in case of draw, neither player's score is incremented
			}
		}

		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("Player 2");
		} else {
			System.out.println("Draw");
		}
	}
}
