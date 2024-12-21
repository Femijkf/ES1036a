import java.io.*;
import java.nio.file.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileDisplay {
    private String namedFile;

    public FileDisplay(String namedFile) {
        this.namedFile = namedFile;
    }

    // method that runs when no arguments are placed
    public void display() throws IOException {
        // try and catch permits the code from running despite the FileNotFoundException
        // and allows the error to be overloaded with text
        File file = new File(namedFile);

        if (!file.exists()) {
            System.out.println("The file does not exists");
            System.exit(0);
        }

        Scanner input = new Scanner(file);
        String fileData;
        while (input.hasNext()) {
            fileData = input.nextLine();
            System.out.println(fileData);
        }
        input.close();

    }

    // method that runs and ends up to line "n"
    public void display(int n) throws IOException {
        // try and catch permits the code from running despite the FileNotFoundException
        // and allows the error to be overloaded with text

        File file = new File(namedFile);

        int counter = 0;

        if (!file.exists()) {
            System.out.println("The file does not exists");
            System.exit(0);
        }

        Scanner input = new Scanner(file);
        String fileData;
        while (input.hasNext() && counter < n) {
            fileData = input.nextLine();
            System.out.println(fileData);
            counter++;
        }
        input.close();
    }

    // method that runs betwewn the lines of "from" to "to"
    public void display(int from, int to) throws IOException {
        // try and catch permits the code from running despite the FileNotFoundException
        // and allows the error to be overloaded with text
        File file = new File(namedFile);

        if (!file.exists()) {
            System.out.println("The file does not exists");
            System.exit(0);
        }

        Scanner input = new Scanner(file);
        String fileData;
        int counter = 0;
        while (input.hasNext() && counter < (from - 1)) {
            fileData = input.nextLine();
            counter++;
        }

        while (input.hasNext() && counter < to) {
            fileData = input.nextLine();
            System.out.println(fileData);
            counter++;
        }
        input.close();
    }
}
