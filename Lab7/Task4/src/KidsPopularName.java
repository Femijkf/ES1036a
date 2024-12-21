import java.io.*;
import java.util.Scanner;

public class KidsPopularName {
    private String[] kidsNames;
    private String fileName;

    // constructor that initializes the variables
    public KidsPopularName(String fileName) throws IOException {
        this.fileName = fileName;
        kidsNames = new String[getNumNames()];
        fillNames();
    }

    // getNumNames method that calculates the number of names in a file
    private int getNumNames() throws IOException {
        int fileLength = 0;
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext()) {
            inputFile.nextLine();
            fileLength++;
        }
        return fileLength;
    }

    // fillNames method that fills the kidsNames array with elements
    // from the respective files
    private void fillNames() throws IOException {
        int counter = 0;
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext() && counter < getNumNames()) {
            kidsNames[counter] = inputFile.nextLine();
            counter++;
        }
        inputFile.close();
    }

    // isPopularName method that checks the compiled array to see if
    // the user selected name is "popular"
    public boolean isPopularName(String name) throws IOException {
        for (int i = 0; i < getNumNames(); i++) {
            if (name.equalsIgnoreCase(kidsNames[i])) {
                return true;
            }
        }
        return false;
    }
}
