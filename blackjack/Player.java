package blackjack;

import java.util.ArrayList;

public abstract class Player {

    protected Hand hand;
    protected boolean drawn = false;

    public abstract boolean makeMove(Deck deck);

    public boolean bust() {
        return this.hand.getValue() > 21;
    }

    public int getValue() {
        return this.hand.getValue();
    }

    public String getHand() {
        ArrayList<Card> cards = this.hand.getHand();
        String ret = "";
        for (Card card : cards) {
            ret += card.toString() + ", ";
        }
        return ret;
    }

}
