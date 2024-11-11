package Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaSample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(2);
        numbers.add(7);
        numbers.add(4);
        numbers.add(8);

        numbers.forEach((n) -> {System.out.println(n);});
        
        /*
        //lambda expressions can be stored in variables if the variable's type is an interface which has only one method
        the expression should have the same number of parameters and the same type as that method
        Consumer<Integer> method = (n) -> {System.out.println(n);};
        numbers.forEach(method);
     */
    }
}

/*
 * A lambda expression is a short block of code that takes in parameters and returns a value
 * Similar to methods but don't need a name and they can be implemented right in the body of a method
 * Syntax
 * parameter -> expression
 * (parameter1, parameter2) -> {code block} / expression
 * 
 */