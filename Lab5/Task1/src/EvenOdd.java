import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // the if-else statements here check to see if the number chosen by the user is EVEN or ODD
        if (number%2 == 0) {
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }

    }
}
