import java.io.*;
import java.util.*;

public class Write {

    private Formatter output;

    public void openFile(String fileName) //open text file
    {
        try {
            output = new Formatter(fileName);
        } catch (SecurityException ex) {
            System.err.println("You do not have write access to this file.");

        } catch (FileNotFoundException ex) {
            System.err.println("Error opening or creating file.");

        }
    }

    public void writeFile(Person c) //take obj
    {

        try {
            output.format(c.toString() + "\n\n");

        } catch (FormatterClosedException ex) {
            System.err.println("Error writing to file");
        }
    }

    public void closeFile() //close text file
    {
        if (output != null) {
            output.close();
        }
    }

}
