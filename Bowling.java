import java.util.Random;

public class Bowling {

    private int rolls;
    private int rollscore;
    private int pins = 10;
    private int CFS;

    public int score() {

        rolls = 1;
        rollscore = 0;
        CFS = 0;

        while (rolls <= 2) {
            Random RN = new Random();
            rollscore = RN.nextInt(pins + 1);
            pins = pins - rollscore;
            System.out.println(" You scored " + rollscore);
            CFS += rollscore;
                if (rolls == 1 && rollscore == 10) {
                    System.out.println("STRIKE!");
                }
                else if (rolls == 2 && CFS == 10) {
                    System.out.println("SPARE!");
                }
            rolls++;
        }
        return rollscore;
}

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Bowling b = new Bowling();
            b.score();
            System.out.println("");
        }
    }
} 
