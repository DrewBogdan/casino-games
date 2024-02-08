package blackjack;

import java.util.ArrayList;

public class Dealer extends Player{

    public boolean makeMove(Deck deck) {
        if (this.drawn) {
            if (this.hand.getValue() < 17) {
                this.hand.hit();
                return true;
            }
        }
        else {
            this.hand = new Hand(deck);
            this.hand.draw();
            this.drawn = true;
            return true;
        }
        return false;
    }

    @Override
    public String getHand() {
        ArrayList<Card> cards = this.hand.getHand();
        String ret = "";
        int count = 0;
        for (Card card : cards) {
            if (count == 1) {
                ret += "##, ";
            }
            else {
                ret += card.toString() + ", ";
            }
            count++;
        }
        return ret;
    }

    public String getFullHand() {
        return super.getHand();
    }
}
