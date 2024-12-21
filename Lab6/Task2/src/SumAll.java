import java.util.Scanner;

public class SumAll {
    public static void main(String[] args) {
        int number = 0;
        int total = 0;

        // asking the user for their chosen number
        Scanner input = new Scanner(System.in);

        // do-while loop that ensures the users input is a positive nonzero integer
        do {
            number = input.nextInt();
        } while (number <= 0);

        // do-while loop that uses the total variable to hold add values and number-- which
        //reduces the number chosen by one and add it to the total variable
        do {
            total = total + number--;
        } while (number > 0);

        System.out.println(total);
    }
}
