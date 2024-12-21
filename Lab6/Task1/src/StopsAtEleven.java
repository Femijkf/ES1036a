import java.util.Scanner;

public class StopsAtEleven {
    public static void main(String[] args) {
        int userInput = 0;
        // counter int variable to keep track of the numbers that are not equal to 11
        int counter = 0;

        Scanner input = new Scanner(System.in);

        // while loop that checks in the user's input is equal to 11 or not AND if the input
        // is greater or equal to 0
        while (userInput != 11) {
            if (userInput != 11 && userInput >= 0) {
                counter++;
            }
            userInput = input.nextInt();
        }
        System.out.println(--counter);
    }
}