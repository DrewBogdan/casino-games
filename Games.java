import blackjack.Blackjack;
import craps.Craps;
import roulette.Roulette;

public class Games {

    public static void main(String[] args) {
        int game = 1;

        if (game == 1) {
            craps();
        }
        else if (game == 2){
            roulette();
        }
        else if (game == 3) {
            blackjack();
        }
        else {
            System.exit(0);
        }
    }

    public static void craps() {
        Craps game = new Craps();
        game.run();
    }

    public static void roulette() {
        Roulette game = new Roulette();
        game.run();
    }

    public static void blackjack() {
        Blackjack game = new Blackjack();
        game.run();
    }

}
