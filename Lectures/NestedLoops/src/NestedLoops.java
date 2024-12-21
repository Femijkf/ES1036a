import javax.swing.*;
import java.awt.image.SinglePixelPackedSampleModel;
import java.io.*;
import java.util.Scanner;
public class NestedLoops {
    public static void main(String[] args) throws IOException {
        /*
        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the shape height: ");
        int n = input.nextInt();

        // Creates a text file named readme.txt
        // opens or creates a file (if it does not exist) and appends new info to that file
        FileWriter fW = new FileWriter("readme.txt", true); // allows new "runs" of the code to appended previous runs

        // open or creates a file from sratch and clears theat file's data before re-running code
        PrintWriter outputFile = new PrintWriter(fW);

        //for-loop that prints the * pattern directly into the file and not on the console
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                outputFile.print("*  ");
            }
            outputFile.println();
        }
        // closes the file for printed pattern to be saved on the "readme" text file
        outputFile.close();

        // create a file for read only
        File dataFile  = new File("numbers.txt");
        Scanner inputFile = new Scanner(dataFile);
        //read from the file and print to the console
        int n1, n2, n3, sum = 0, counter = 0;
        while (inputFile.hasNext()) {
            n1 = inputFile.nextInt();
            n2 = inputFile.nextInt();
            n3 = inputFile.nextInt();

            int total = n1 + n2 + n3;
            sum += total;
            counter++;
            System.out.println(n1 + " " +  n2 + " " + n3 + " " + total + " " + (total));
        }
        System.out.println();
        System.out.println(sum/counter);
    }
}
