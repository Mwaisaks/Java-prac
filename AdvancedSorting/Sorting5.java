//Sorting String objects based on the length of the Strings

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting5 {
    public static void main(String[] args) {
        
        ArrayList<String> string = new ArrayList<String>();

        string.add("Alone");
        string.add("Taste");
        string.add("Comparison");
        string.add("Logic");
        string.add("Github");

        Comparator<String> comparator = new Comparator<String>(){
            public int compare(String string1, String string2){
                if (string1.length() > string2.length()) {
                    return 1;
                }
                else if(string1.length() < string2.length()){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        };
        /*
         * The semicolon here is required because I'm creating an anonymous 
         * instance of a class that implements comaprator, which is effectively 
         * a single statement in the code
         */

        //lambada expression for the compare method
        //Comparator<String> comparator = (string1, string2) -> Integer.compare(string1.length(), string2.length());

        Collections.sort(string, comparator);

        System.out.println("Strings sorted by length: ");
        for(String i : string){
            System.out.println(i);
        }
    }
}

