import java.io.*;

public class FilesDemo {
    public static void main(String[] args) throws IOException {

        FileSave fileSave = new FileSave("lines.txt");
        String text = "1-Lorem ipsum dolor sit amet\n" +
                "2-Consectetuer adipiscing elit\n" +
                "3-Sed diam nonummy nibh euismod tincidunt\n" +
                "4-Ut wisi enim ad minim veniam\n" +
                "5-Quis nostrud exerci tation ullamcorper\n" +
                "6-Suscipit lobortis nisl ut aliquip ex ea commodo consequat\n" +
                "7-Duis autem vel eum iriure dolor in hendrerit\n" +
                "8-Vel illum dolore eu feugiat nulla facilisis at vero eros";

        fileSave.save(text);

        // fileDisplay instance is made to check if the file exists first
        // before using the "fileSave" instance to that would create a new file regardless
        FileDisplay fileDisplay = new FileDisplay("lines.txt");
        fileDisplay.display();
        fileDisplay.display(3);
        fileDisplay.display(10);
        fileDisplay.display(3, 5);
        
    }
}

