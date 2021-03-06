/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Ace", "Hearts", 11);
		Card card2 = new Card("2", "Clubs", 2);
		Card card3 = new Card("King", "Spades", 10);
		
		System.out.println(card1.suit());
		System.out.println(card2.suit());
		System.out.println(card3.suit());
		
		System.out.println(card1.rank());
		System.out.println(card2.rank());
		System.out.println(card3.rank());
		
		System.out.println(card1.pointValue());
		System.out.println(card2.pointValue());
		System.out.println(card3.pointValue());
		
		System.out.println(card1.matches(card2));
		
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		System.out.println(card3.toString());
	}
}