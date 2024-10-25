import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexSample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3schools!");
        boolean matchFound = matcher.find();

        if (matchFound){
            System.out.println("Match Found!");
        }
        else {
            System.out.println("Match not found!Give me a general ");
        }
    }
}

/*
contained in the java.util.regex package, contains 3 classes;
Pattern class; compiles a regular expression pattern that can be used in text searches
Matcher Class; used to search or match the compiled Pattern within a specific string
PatternSyntaxException Class; indicates syntax errors in the pattern.
 * Applications of Java Regular Expressions
 * Input validation; validating formats like emails, phonenumbers, postal codes.
 * Data Extraction; Extracting specific data like dates, urls, or numbers from text
 * String Manipulation: replacing, splitting or modifying text based on patterns
 */