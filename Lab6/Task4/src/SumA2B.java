import java.util.Scanner;

public class SumA2B {
    public static void main(String[] args) {
        int value1;
        int value2;
        int total = 0;

        Scanner input = new Scanner(System.in);

        // obtaining the users input for starting and ending number
        value1 = input.nextInt();
        value2 = input.nextInt();

        // for loop that add the user's initial value plus the increasing user value
        // in increments of +1 then exiting the loop once int i > value2 (user's second input)
        for (int i = value1; i <= value2; i++ ) {
            total = total + i;
        }

        System.out.println(total);
    }
}
