package blackjack;

import java.util.ArrayList;

public class Hand {
    private Deck deck;
    private ArrayList<Card> hand;

    public Hand(Deck deck) {
        this.deck = deck;
        this.hand = new ArrayList<>();
    }

    public int getValue() {
        int val = 0;
        for (Card card : hand) {
            val += card.getValue();
        }
        return val;
    }

    public void draw() {
        this.hand.add(this.deck.getCard());
        this.hand.add(this.deck.getCard());
    }

    public void hit() {

    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }
}
