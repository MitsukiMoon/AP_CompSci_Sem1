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
		String [] ranks = {"A", "B", "C"};
		String [] suits = {"Giraffes", "Lions"};
		String [] suits2 = {"Toshiro", "Karma"};
		String [] suits3 = {"Alice", "Lily"};
		int [] values = {2,1,6};
		Deck Penguins = new Deck(ranks, suits , values);
		Deck Happy = new Deck (ranks, suits2, values );
		Deck Anime = new Deck (ranks, suits3, values);
		
		System.out.println(Penguins.deal());
		System.out.println(Happy.deal());
		System.out.println(Anime.deal());
	}
}
