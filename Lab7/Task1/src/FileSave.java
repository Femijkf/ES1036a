import java.io.*;

public class FileSave {
   private String fileName;

   // the constructor that sets this.fileName to have the value of the argument fileName string
   public FileSave(String fileName) {
       this.fileName = fileName;
   }

   // method that open/creates a file defined by the constructor
   public void save(String line) throws IOException {
       PrintWriter outputFile = new PrintWriter(fileName);

       outputFile.print(line);
       outputFile.close();
   }
}
