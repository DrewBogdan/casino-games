package blackjack;

public abstract class Player {

    protected Hand hand;
    protected boolean drawn = false;

    public abstract void makeMove(Deck deck);

    public boolean bust() {
        return this.hand.getValue() > 21;
    }

    public int getValue() {
        return this.hand.getValue();
    }

}
