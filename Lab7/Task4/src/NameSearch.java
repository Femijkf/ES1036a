import java.io.IOException;
import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) throws IOException {
        KidsPopularName boyNames = new KidsPopularName("BoyNames.txt");
        KidsPopularName girlNames = new KidsPopularName("GirlNames.txt");

        Scanner input = new Scanner(System.in);
        System.out.print("What name do you want to check: ");
        String name = input.nextLine();

        // if-else statement that checks to see if the name is popular for boy, girls or neither
        if (boyNames.isPopularName(name)) {
            System.out.println(name + " is one of the most popular boy's names");
        }
        else if (girlNames.isPopularName(name)) {
            System.out.println(name + " is one of the most popular girl's names");
        }
        else {
            System.out.println(name + " is not one of the most popular kid's names");
        }
    }
}
