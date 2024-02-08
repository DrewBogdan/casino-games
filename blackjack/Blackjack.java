package blackjack;

import java.util.ArrayList;

public class Blackjack {
    Deck deck;

    public void run() {
        this.deck = new Deck(6);
        round();
    }

    private void round() {
        Player user = new User();
        Player dealer = new Dealer();
        ((User) user).changeMoney(1200);
        ((User) user).changeMoney(-111);
        draw(user, this.deck);
        draw(dealer, this.deck);
        System.out.println("Current User Hand: " + user.getHand());
        System.out.println("Current Dealer Hand: " + dealer.getHand());
        userDraw((User) user, this.deck);
        dealerDraw((Dealer) dealer, this.deck);
        System.out.println("New Dealer Hand: " + ((Dealer) dealer).getFullHand());
        outcome((Dealer) dealer, (User) user);
    }

    private void draw(Player player, Deck deck) {
        player.makeMove(deck);
    }

    private void dealerDraw(Dealer dealer, Deck deck) {
        boolean hit = true;
        while (hit) {
            hit = dealer.makeMove(deck);
        }
    }

    private void userDraw(User user, Deck deck) {
        boolean hit = true;
        while (hit) {
            hit = user.makeMove(deck);
            System.out.println("New Hand: " + user.getHand());
        }
    }

    private void outcome(Dealer dealer, User user) {
        if(user.getValue() > dealer.getValue() && !user.bust()) {
            System.out.println("User Wins!");
        }
        else if (user.bust()) {
            System.out.println("User Bust, Dealer Wins!");
        }
        else if (dealer.bust()) {
            System.out.println("Dealer Bust, User Wins!");
        }
        else {
            System.out.println("Dealer Wins!");
        }
    }
}
