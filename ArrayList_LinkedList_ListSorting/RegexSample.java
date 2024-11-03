import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexSample{
    public static void main(String[] args) {
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("The price is 200 dollars");

        while(matcher.find()){
            System.out.println("Found number: "+ matcher.group());
        }

        String result = matcher.replaceAll("[number]");
        System.out.println("Modified String: "+ result);
    }
}
/* 
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

*/


/*
contained in the java.util.regex package, contains 3 classes;
Pattern class; compiles a regular expression pattern that can be used in text searches
Matcher Class; used to search or match the compiled Pattern within a specific string
PatternSyntaxException Class; indicates syntax errors in the pattern.

Basic Syntax for Java Regex Program

//import the classes
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExample {
    public static void main(String[] args) {
        //compile the regex pattern using Pattern.compile()
        Pattern pattern = Pattern.compile("pattern here");
        //create Matcher object by passing the input string to Pattern.matcher()
        Matcher matcher = pattern.matcher("input string here");

        //Use Matcher methods like .find(), .matches(), or .replaceAll() to interact with the pattern.

        while (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        }
    }
}

Common Methods in Matcherand Pattern Classes
boolean find() : searches for the next subsequence that matches the pattern.
boolean matches(): checks if ther entire input sequence matches the pattern.
String replaceAll(String replacement): Replaces all occurrences of the pattern with the provided string.
String group(): returns the matched subsequence.

Flags for Pattern Compilation
-flags modify how the regex search is performed
Pattern.CASE_INSENSITIVE: Ignores case
Pattern.LITERAL; Treats special characters as normal characters.
Pattern.UNICODE_CASE; works with CASE_INSENSITIVE to ignore case across Non-English alphabets.

Core Regular Expression Patterns
Brackets - used to find specific character ranges:
[abc] -matches any one of the characters
[^abc] -matches any character except a,b, and c
[0-9] -matches any digit from 0-9

MetaCharacters - have special meanings
| :matches any one of the patterns e.g. cats|dogs
. :match any character except newline.
^ :matches the start of a string
$ :matches the end of a string
\d: matches any digit (0-9)
\s: matches any whitespace character
\b: matches at the beginning or end of a word i.e \bword, word\b 

Quantifiers
n+: matches one or more occurrences of n.
n*: matches zero or more occurrences of n.
n?: matches zero or one occurrence of n.
n{x}: matches exactly x occurrences of n.
n{x,y}: matches between x and y occurrences.
n{x,} : matches at least x occurrences.

 * Applications of Java Regular Expressions
 * Input validation; validating formats like emails, phonenumbers, postal codes.
 * Data Extraction; Extracting specific data like dates, urls, or numbers from text
 * String Manipulation: replacing, splitting or modifying text based on patterns
 */