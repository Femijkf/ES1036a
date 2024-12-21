import java.util.Scanner;
import java.lang.Math;

public class PrintSquares {
    public static void main(String[] args) {
        int N;
        int number;
        int total;
        int constant;

        Scanner input = new Scanner(System.in);

        do {
            N = input.nextInt();
        } while (N <= 0);

        // obtaining the square root of the user's input
        number = (int) Math.sqrt(N);
        constant = number;

        // do-while loop that subtracts 1 value less than the square rooted input and slowly
        // decreases the subtraction till it matches the initial square rooted values
        do {
            total = constant - (--number);
            System.out.print((total*total));
            // if-else statement that determines if a comma "," or a period "." should be used
            if (number != 0 ){
                System.out.print(", ");
            }
            else {
                System.out.println(".");
            }
        } while (number != 0);
    }
}
