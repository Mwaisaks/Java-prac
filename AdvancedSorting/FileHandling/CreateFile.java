package FileHandling;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class CreateFile {
    public static void main(String[] args) {
        //Creating the file
        try {
            File myFile = new File("FileHandling/Files2.txt");

            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            }
            else{
                System.out.println("File already exists!");
            }

        } catch ( IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            // TODO: handle exception
        }


        //Writing to the file
        try {
            FileWriter myWriter = new FileWriter("FileHandling/Files2.txt");

            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occured!");
            e.printStackTrace(); //what's this line doing here?
            // TODO: handle exception
        }

    }
}
