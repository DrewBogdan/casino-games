package blackjack;

import craps.Scoring;

import java.util.Locale;
import java.util.Scanner;

public class User extends Player{

    private int money;
    private String name;

    public User(String name) {
        this.name = name;
    }
    public User(){}

    public boolean makeMove(Deck deck) {
        if (this.drawn) {
            System.out.println("Hit(h), Stand(s), Split(p)?");
            Scanner inp = new Scanner(System.in);
            String val = inp.next().toLowerCase(Locale.ROOT);
            switch(val) {
                case "h":
                    this.hand.hit();
                    return true;
                case "s":
                    System.out.println("Stand!");
                    return false;
                case "p":
                    break;
            }
        }
        else {
            System.out.println("Would you like to make a bet? (Y/n)");
            Scanner inp = new Scanner(System.in);
            if (inp.next().toLowerCase(Locale.ROOT).equals("y")) {
                this.hand = new Hand(deck);
                this.drawn = true;
                System.out.println("Current Bank: " + this.money);
                int bet = 0;
                boolean validBet = true;
                while(validBet) {
                    System.out.println("How much would you like to bet? ");
                    bet = inp.nextInt();
                    if (bet > this.money)
                        System.out.println("You cant bet that.");
                    else
                        validBet = false;
                }
            }
            return true;
        }
        return false;
    }

    public void name(String name) {
        this.name = name;
    }

    public void changeMoney(int change) {
        this.money += change;
    }
}
