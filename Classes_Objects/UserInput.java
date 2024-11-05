/*import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        String name;
        int age;
        double salary;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = keyboard.nextLine();

        System.out.print("Enter your age: ");
        age = keyboard.nextInt();

        System.out.print("Enter your Salary: ");
        salary = keyboard.nextDouble();
        
        System.out.println("Hello " +name);
        System.out.println("You are " + age +" years old");
        System.out.println("Your salary is " + salary);

    }
} */


/*
 * Java.util package contains Scanner class
 * Scanner class provides System.in and System.out objects
 * Scanner class methods for reading user input
 * nextBoolean()
 * nextByte()
 * nextDouble()
 * nextInt()
 * nextLine()
 * nextLong()
 * nextShort()
 * 
 * 
 * Reading a Single Character
 * Scanner clas doesn't have a method for reading a single character 
 * use .nextLine() method and the nextChar method
 * 
 */

import java.util.Scanner;

public class UserInput{
    public static void main(String[] args){
        String input;
        char answer;

        //create a scanner object for keyboard input
        @SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);

        //ask the user a question
        System.out.print("Would you like to proceed? (Y- yes/ N- No): ");
        input = keyboard.nextLine();
        answer = input.charAt(0);

        //display the answer
        System.out.println(answer);
    }
}


