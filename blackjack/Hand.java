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
        int aceCount = 0;
        for (Card card : hand) {
            if (card.isAce()) {
                aceCount++;
            }
            else {
                val += card.getValue();
            }
        }
        for (int i = 0; i < aceCount; i++) {
            if ((val + 11) > 21) {
                val += 1;
            }
            else {
                val += 11;
            }
        }
        return val;
    }

    public void draw() {
        this.hand.add(this.deck.getCard());
        this.hand.add(this.deck.getCard());
    }

    public void hit() {
        this.hand.add(this.deck.getCard());
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }
}
