public class Main {

    public static void main(String[] args) {
        var myDeck = new Deck(true);
        System.out.println(myDeck);
        myDeck.takeCard(Card.Rank.ACE, Card.Suit.CLUBS);
        System.out.println(myDeck);
        myDeck.addCard(new Card(Card.Rank.ACE, Card.Suit.CLUBS));
    }
}
