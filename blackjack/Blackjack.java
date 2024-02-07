package blackjack;

import java.util.ArrayList;

public class Blackjack {
    Deck deck;

    public void run() {
        this.deck = new Deck(6);
        round();
    }

    public void round() {
        Player user = new User();
        Player dealer = new Dealer();
        ((User) user).changeMoney(1200);
        ((User) user).changeMoney(-111);
        user.makeMove(this.deck);
        dealer.makeMove(this.deck);
        user.makeMove(this.deck);
        dealer.makeMove(this.deck);

        if(user.getValue() > dealer.getValue() && user.getValue() <= 21) {
            System.out.println("User Wins!");
        }
        else {
            System.out.println("Dealer Wins!");
        }
    }
}
