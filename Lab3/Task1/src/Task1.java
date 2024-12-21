import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // two defined int variables
        int firstNumber;
        int secondNumber;

        Scanner input = new Scanner(System.in);
        // reads the next integer input by the keyboard
        firstNumber = input.nextInt();
        // reads the next following integer input by the keyboard (after the previous one)
        secondNumber = input.nextInt();

        // prints out the final mathematical statement
        System.out.println((firstNumber*firstNumber) + (secondNumber*secondNumber));
    }
}
