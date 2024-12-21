import java.util.Scanner;

public class MagicDatesDemo {
    public static void main(String[] args) {
        int month;
        int day;
        int year;

        // Scanner is used to prompt the user to input a month, date and year
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month (in number form): ");
        month = input.nextInt();
        System.out.print("Enter a day (in number form): ");
        day = input.nextInt();
        System.out.print("Enter a year (last two digits): ");
        year = input.nextInt();

        MagicDate magicDate = new MagicDate(month, day, year);
        System.out.println();

        // this if-else statement uses a MagicDate instance (magicDate) which determines if
        // the date is magic or not
        if (magicDate.isMagic()) {
            System.out.println("The date " + month + "/" + day + "/" + year + " is magic!");
        }
        else {
            System.out.println("The date " + month + "/" + day + "/" + year + " is not magic!");
        }

    }
}
