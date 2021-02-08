import java.io.FileOutputStream;
import java.io.PrintStream;

class inputException {

    public void call() {
        FileOutputStream out; // declare a file output object
        PrintStream p; // declare a print stream object

        try
        {
            // Create a new file output stream
            // connected to "myfile.txt"
            out = new FileOutputStream("myfile.txt");

            // Connect print stream to the output stream
            p = new PrintStream( out );

            p.append ("this is my file");

            p.close();
        }
        catch (Exception e)
        {
            System.out.println ("Error writing to file");
        }
    }
}

