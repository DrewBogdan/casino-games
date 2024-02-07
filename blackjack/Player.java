package blackjack;

public abstract class Player {

    protected Hand hand;
    protected boolean drawn = false;

    public abstract void makeMove(Deck deck);

    public boolean bust() {
        return hand.getValue() > 21;
    }

}
