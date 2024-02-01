package craps;

import java.util.Locale;
import java.util.Scanner;

public class Craps {

    public void run() {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        Scoring score = new Scoring();
        //boolean roll = true;
        int roll = 0;
        int craps_count = 0;
        int longest = 0;
        int long_count = 0;
        //while (roll) {
        while (roll < 2000) {
            d1.roll();
            d2.roll();
            String rez = score.score(d1, d2);
            System.out.println(rez);
            if (rez.contains("Craps 7")) {
                craps_count++;
                if (long_count > longest) {
                    longest = long_count;
                }
                long_count = 0;
            }
            else {
                long_count++;
            }
            /*
            Scanner input = new Scanner(System.in);

            System.out.println("Roll Again? (y/n)");
            String user = input.next();
            if (!user.toLowerCase(Locale.ROOT).equals("y")) {
                roll = false;
            }*/
            roll++;

        }
        System.out.println("Craps Count over 2000 rolls: " + craps_count);
        System.out.println("Longest Roll: " + long_count);
    }
}
