package blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;
    private ArrayList<Card> used;

    public Deck(int deckCount) {
        this.deck = new ArrayList<>();
        for (int i = 0; i < deckCount; i++) {
            make_deck(this.deck);
        }
        Collections.shuffle(this.deck);
        this.used = new ArrayList<>();
    }

    private void make_deck(ArrayList<Card> deck) {
        String[] suits = {"s","c","d","h"};
        for (int suit = 0; suit < 4; suit++) {
            String cur_suit = suits[suit];
            for (int val = 1; val < 14; val++) {
                String cur_val = "" + val;
                int num = val;
                if (val == 1) {
                    cur_val = "a";
                    num = 11;
                }
                if (val == 11) {
                    cur_val = "j";
                    num = 10;
                }
                if (val == 12) {
                    cur_val = "q";
                    num = 10;
                }
                if (val == 13) {
                    cur_val = "k";
                    num = 10;
                }
                Card card = new Card(cur_suit, cur_val, num);
                deck.add(card);
            }
        }
    }

    public Card getCard() {
        Card top = this.deck.remove(0);
        used.add(top);
        return top;
    }

    public String toString() {
        String ret = "";
        for (Card card : this.deck) {
            ret += card.toString() + "\n";
        }
        return ret;
    }
}