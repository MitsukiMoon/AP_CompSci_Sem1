/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String [] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String [] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
		int [] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1};
		
		Deck Penguins = new Deck(ranks, suits , values);

		
		System.out.println(Penguins.deal());

		
		
	}
}
