package blackjack;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Table {

    private Dealer dealer;
    private ArrayList<User> users;

    // Deck originally given to all players, now keeping it held as part of the table
    private Deck deck;
    private int deckCount;

    public Table(int playerCount, ArrayList<String> playerNames, int deckCount) {
        this.dealer = new Dealer();
        this.users = new ArrayList<>();

        this.deck = new Deck(deckCount);
        this.deckCount = deckCount;

        for (int x = 0; x < playerCount; x++) {
            this.users.add(new User(playerNames.get(x)));
        }
    }

    /**
     * Runs the user end turn for a given user
     */
    private void userPlay(User user) {
        boolean hit = true;
        while(hit) {
            System.out.println("Hit(h), Stand(s), Split(p)?");
            Scanner inp = new Scanner(System.in);
            String val = inp.next().toLowerCase(Locale.ROOT);
            switch (val) {
                case "h":
                    user.drawCard(this.deck.getCard());
                    System.out.println("New Hand: " + user.getHand());
                case "s":
                    hit = false;
                    System.out.println("Stand!");
                case "p":
                    break;
            }
        }
    }

    /**
     * Initial Deal out of cards
     */
    private void dealCards() {
        for (int x = 0; x < 2; x++) {
            dealer.drawCard(this.deck.getCard());
            for (User user : this.users) {
                user.drawCard(this.deck.getCard());
            }
        }
    }

    /**
     * Shuffles the current used deck
     */
    private void shuffleDeck() {
        this.deck = new Deck(this.deckCount);
    }
}
