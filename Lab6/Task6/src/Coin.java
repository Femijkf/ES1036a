import java.util.Random;

public class Coin {
    private String sideUp;

    public Coin() {
        sideUp = "";
    }

    //toss method that uses the java.util.Random library to produce a random number between 0-1
    //then uses an if-else statement to decide whether sideUp should be "heads" or "tails"
    public void toss() {
        int randomNumber;
        Random random = new Random();
        randomNumber = random.nextInt(2);

        if (randomNumber == 0) {
             sideUp = "heads";
        }
        else {
            sideUp = "tails";
        }
    }

    //the getSideUp method returns the side of the coin that is facing up
    public String getSideUp() {
        return sideUp;
    }
}