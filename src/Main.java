import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var myDeck = new Deck(true);
        var myScanner = new Scanner(System.in);
        myDeck.shuffle();

        // war ig
        var player1 = new ArrayList<Card>();
        var player2 = new ArrayList<Card>();

        for (var i = 0; i < 26; i++) {
            player1.add(myDeck.takeTopCard());
        }

        for (var i = 0; i < 26; i++) {
            player2.add(myDeck.takeTopCard());
        }

        while (true) {
            System.out.println("WAR CARD GAME THING... PRESS ENTER KEY TO FLIP CARD");
            myScanner.nextLine();
            var card1 = player1.remove(player1.size() - 1);
            var card2 = player2.remove(player2.size() - 1);
            System.out.printf("%s vs %s\n\n", card1.toString(), card2.toString());
        }

    }
}
