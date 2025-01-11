public class MathUtils {
    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public boolean isEven(int number){
        return number % 2 == 0;
    }
}
