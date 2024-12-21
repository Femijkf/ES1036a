import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        // defining a double variable called "decimalValue"
        double decimalValue;

        Scanner input = new Scanner(System.in);
        decimalValue = input.nextDouble();

        // equations for splitting the double into whole and fractional parts
        int row1 = (int) decimalValue;
        double row2 = decimalValue - (int) decimalValue;

        System.out.println((double) row1 + "\n" + row2);

    }
}
