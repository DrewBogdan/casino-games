package craps;

import java.util.Random;

/**
 * Basic dice class for rolling a die.
 * Author: Bog
 * Date 1/30/2024
 */
public class Dice {

    private int side_up;

    /**
    * Constructor for the Dice class. Sets initial side up to 1;
    * */
    public Dice() {
        this.side_up = 1;
    }

    /**
     * @return the current dice's side up
     */
    public int getSide_up() {
        return this.side_up;
    }

    /**
     * rolls the dice on the 6 sides
     * @return the current side up
     */
    public int roll() {
        Random rand = new Random();
        this.side_up = rand.nextInt(6) + 1;
        return this.side_up;
    }
}
