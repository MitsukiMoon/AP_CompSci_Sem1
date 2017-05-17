/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card QueenSpade = new Card("Queen", "Spades", 12);
		Card KingDiamond = new Card("King", "Diamond", 13);
		Card Queen = new Card("Queen", "Spades", 12);
		
		System.out.println (QueenSpade);
		Queen.rank();
		System.out.println(QueenSpade.matches(KingDiamond));
		
	}
}
