package blackjack;

public class Card {

    private int value;
    private String suit;
    private String card;
    private boolean ace;

    /**
     *
     * @param suit Suit of the card (s,c,d,h)
     * @param card Name of the Card (1-10,j,q,k,a)
     * @param value Value of the card (1-10 or 11 for ace)
     */
    public Card(String suit, String card, int value) {
        this.suit = suit;
        this.card = card;
        this.value = value;
        if (value == 11) {
            this.ace = true;
        }
    }

    public int getValue() {
        return this.value;
    }

    public boolean isAce() {
        return this.ace;
    }
    public String toString() {
        return (this.card + this.suit);
    }
}
