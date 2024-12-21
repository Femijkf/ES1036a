
public class CoinTossSimulator {
    public static void main(String[] args) {
        int headsCounter = 0;
        int tailsCounter = 0;
        Coin coined = new Coin();

        // following 3 lines run the toss and getSideUp methods to dictate which side was initially facing up
        coined.toss();
        System.out.println("The side initially facing up: " + coined.getSideUp());
        System.out.println("Now I will todd the coin 10 times.");

        // for loop that runs the toss method and checks the side up with getSideUp 10 times
        for (int i = 0; i < 10; i++) {
            coined.toss();
            System.out.println("Toss: " + coined.getSideUp());
            if (coined.getSideUp() == "heads") {
                headsCounter++;
            }
            else {
                tailsCounter++;
            }
        }

        //prints out the total heads and tails in the sequence using headsCounter and tailsCounter
        System.out.println("Total Heads: " + headsCounter);
        System.out.println("Total Tails: " + tailsCounter);

    }
}