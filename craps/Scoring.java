package craps;

public class Scoring {
    private boolean hard;
    private int total;
    private int on;

    public String score(Dice d1, Dice d2){
        this.hard = (d1.getSide_up() == d2.getSide_up());
        this.total = d1.getSide_up() + d2.getSide_up();
        return get_results();
    }

    public String get_results() {
        String results = "";
        results += hards();
        results += field();
        if (this.total == 7) {
            results += seven();
        }
        else if (4 <= this.total && this.total <= 10) {
            results += number(this.total);
        }

        return results;
    }

    public String field() {
        if (total == 2) {
            return "2 Field Double!";
        }
        if (total == 12) {
            return "12 Field Double!";
        }
        if (total == 3 || total == 4 || total == 9 || total == 10 || total == 11) {
            return "" + total + " Field!";
        }
        return "No Field!";
    }

    public String number(int num) {
        if (this.on == num) {
            this.on = 0;
            return "" + num + " Winner, Passline Winner!";
        }
        else if (this.on != 0) {
            return "" + num + " Winner!";
        }
        this.on = num;
        return "" + num + " On!";
    }

    public String seven() {
        if (this.on != 0) {
            this.on = 0;
            this.hard = false;
            return "Craps 7 All lose!";
        }
        return "7 Winner!";
    }

    public String hards() {
        if (this.hard) {
            if (this.total == 2) {
                return "Snake Eyes!";
            }
            else if (this.total == 4) {
                return "Hard 4";
            }
            else if (this.total == 6) {
                return "Hard 6!";
            }
            else if (this.total == 8) {
                return "Hard 8!";
            }
            else if (this.total == 10) {
                return "Hard 10!";
            }
            else if (this.total == 12) {
                return "Hard High 12!";
            }
        }
        return "Easy " + this.total;
    }


}
