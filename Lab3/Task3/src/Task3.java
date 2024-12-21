import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // defines the variable that will later store the keyboard's input
        Scanner input = new Scanner(System.in);

        int d;
        d = input.nextInt();

        System.out.println(d%10 + "<->" + d/10);
    }
}
