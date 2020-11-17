public class Card {

    public enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES};
    public enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};

    private Suit suit;
    private Rank rank;

    public Card(Rank rank, Suit suit) {

    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }
}
