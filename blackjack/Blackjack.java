package blackjack;

import java.util.ArrayList;

public class Blackjack {
    Deck deck;

    public void run() {
        this.deck = new Deck(6);
        Hand dealer = new Hand(deck);
        Hand player = new Hand(deck);
        dealer.draw();
        player.draw();
        System.out.println("Dealer: " + dealer.getHand() + " Value: " + dealer.getValue());
        System.out.println("Player: " + player.getHand() + " Value: " + player.getValue());
    }

}
