package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        //reading the file
        try {
            File myFile = new File("FileHandling/Files2.txt");

            Scanner myReader = new Scanner(myFile);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            // TODO: handle exception
        }

        //File Information
        File myFile = new File("FileHandling/Files2.txt");

        if (myFile.exists()) {
            System.out.println("---File Information---");
            System.out.println("File name: " + myFile.getName());
            System.out.println("Absolute path: " + myFile.getAbsolutePath());
            System.out.println("Writeable: " + myFile.canWrite());
            System.out.println("Readable: " + myFile.canWrite());
            System.out.println("File size in bytes: " + myFile.length());
        } else {
            System.out.println("The file does not exist!");
        }


    }
}