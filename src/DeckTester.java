/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

 /**
  * The main method in this class checks the Deck operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
   String[] ranks = {"A", "B", "C"};
   String[] suits = {"Giraffles", "Lions"};
   int[] values = {2, 1, 6};
   Deck deck = new Deck(ranks, suits, values);
   System.out.println(deck);
 }
}
