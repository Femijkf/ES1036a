import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year;

        System.out.print("Enter a year: ");
        year = input.nextInt();

        // the following if-else statement here run the calculation in the users year choice
        //determining if it is A LEAP YEAR or NOT A LEAP YEAR
        if ((year%4 != 0) || (year%4 == 0 && year%100 == 0 && year%400 == 0)) {
            System.out.println("NOT A LEAP YEAR");
        } else if ((year % 4 == 0 && year%100 != 0) || (year%4 == 0 && year%100 == 0)) {
            System.out.println("A LEAP YEAR");
        }

    }
}
