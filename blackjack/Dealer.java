package blackjack;

import java.util.ArrayList;

public class Dealer extends Player{
    public void makeMove(Deck deck) {
        if (this.drawn) {
            if (this.hand.getValue() < 17) {
                this.hand.hit();
                System.out.println("Dealer Hit!");
            }
            System.out.println("Dealers Hand: " + this.hand.getHand());
        }
        else {
            this.hand = new Hand(deck);
            this.hand.draw();
            this.drawn = true;
            System.out.println("Dealers Draw: " + this.hand.getHand());
        }
    }
}
