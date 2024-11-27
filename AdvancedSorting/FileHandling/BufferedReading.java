package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReading {
    public static void main(String[] args){

        try{
            BufferedReader reader = new BufferedReader(new FileReader("FileHandling/Files2.txt"));
            String line;
            System.out.println("Reading file content: ");
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
