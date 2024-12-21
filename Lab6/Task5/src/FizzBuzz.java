import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        int firstValue;
        int secondValue;

        Scanner input = new Scanner(System.in);

        firstValue = input.nextInt();
        secondValue = input.nextInt();

        // For loop that checks if int i is divisible by 3 and/or 5
        for (int i = firstValue; i <= secondValue; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i%5 == 0) {
                System.out.println("Buzz");
            }
            else if (i%3 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
