import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(boolean autoFill) {
        cards = new ArrayList<Card>();
        if (autoFill)
            for (var suit : Card.Suit.values())
                for (var rank : Card.Rank.values())
                    cards.add(new Card(rank, suit));
    }

    public Deck() {
        cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public boolean hasCard(Card.Rank rank, Card.Suit suit) {
        for (var v : cards)
            if (v.getRank() == rank && v.getSuit() == suit)
                return true;
        return false;
    }

    public boolean hasCard(Card card) {
        return hasCard(card.getRank(), card.getSuit());
    }

    public Card takeCard(Card.Rank rank, Card.Suit suit) {
        for (var i = 0; i < cards.size(); i++)
            if (cards.get(i).getRank() == rank && cards.get(i).getSuit() == suit)
                return cards.remove(i);
        return null;
    }

    public Card takeCard(Card card) {
        return takeCard(card.getRank(), card.getSuit());
    }

    public Card takeTopCard() {
        return cards.remove(cards.size() - 1);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public String toString() {
        return cards.toString();
    }

}
