import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        GradedActivity myScore = new GradedActivity();

        Scanner input = new Scanner(System.in);

        // prompt the user to enter the score
        System.out.print("Enter your score: ");
        myScore.setScore(input.nextDouble());

        System.out.print("Your score grade is: " + myScore.getGrade());

    }
}
