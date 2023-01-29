package YT.Begin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class V44_WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Test row 1");
        pw.println("Test row 2");

        pw.close();
    }
}
