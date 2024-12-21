import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class StudentDB {
    public static void main(String[] args) throws IOException {
        // create an array of students
        Student[] students = new Student[20];
        // Create a file object for students.txt file
        File inputFile =  new File("students.txt"); // will be on final exam --> PRACTICE
        Scanner input = new Scanner(inputFile);

        // to read and skip the first line
        input.nextLine();

        int sCounter = -1;
        String currentSNumber = "";
        while (input.hasNext()) {
            String sNumber = input.next();
            String fName = input.next();
            String lName = input.next();
            String cCode = input.next();
            String cNumber = input.next(); // reads all letter/characters until it reaches a space or end of the line
            String cName = input.nextLine(); //reads all words from the starting point to the end of the line

            Course course =  new Course(cCode, cNumber, cName);

            if (!sNumber.equals(currentSNumber)) {
                Student student = new Student(fName, lName, sNumber);
                student = new Student(fName, lName, sNumber);
                student.addCourse(course);
                students[++sCounter] = student;
            }
            else {
                students[sCounter].addCourse(course);
            }
            currentSNumber = sNumber;

            for (int i = 0; i < sCounter; i++) {
                System.out.print(students[i]);
            }
        }
    }
}
