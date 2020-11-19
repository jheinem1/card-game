import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var myDeck = new Deck(true);
        var myScanner = new Scanner(System.in);
        myDeck.shuffle();

        // war ig
        var player1 = new ArrayList<Card>();
        var player2 = new ArrayList<Card>();

        var player1Score = 0;
        var player2Score = 0;

        for (var i = 0; i < 26; i++) {
            player1.add(myDeck.takeTopCard());
        }

        for (var i = 0; i < 26; i++) {
            player2.add(myDeck.takeTopCard());
        }

        while (player1.size() > 0) {
            System.out.println("WAR CARD GAME THING... PRESS ENTER KEY TO FLIP CARD");
            myScanner.nextLine();
            var card1 = player1.remove(player1.size() - 1);
            var card2 = player2.remove(player2.size() - 1);
            System.out.printf("%s vs %s\n\n", card1.toString(), card2.toString());
            var score = Arrays.asList(Card.Rank.values()).indexOf(card1.getRank()) - Arrays.asList(Card.Rank.values()).indexOf(card2.getRank());
            if (score > 0) {
                player1Score++;
                System.out.printf("Point for you\nSCORE: you: %d, computer: %d\n\n", player1Score, player2Score);
            } else if (score < 0) {
                player2Score++;
                System.out.printf("Point for computer\nSCORE: you: %d, computer: %d\n\n", player1Score, player2Score);
            }
            // else
                //uh
        }

        if (player1Score > player2Score)
            System.out.println("You won!");
        else if (player2Score > player1Score)
            System.out.println("Computer won!");
        else
            System.out.println("Tie!");
        // System.out.println(player1Score > player2Score ? (player2Score > player1Score ? "Computer won!" : "Tie!") : "You won!");

        myScanner.close();

    }
}
