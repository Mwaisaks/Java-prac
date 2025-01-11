public class ManualTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //Test Case 1: Positive Numbers
        int result1 = calculator.add(3,5);
        System.out.println("Test case 1: Expected: 8, Actual: " + result1);

        //Test Case 2: Negative nunbers
        int result2 = calculator.add(-3,-5);
        System.out.println("Test case 2: Expected: -8, Actual: " + result2);

        //Test Case 3: Zero
        int result3 = calculator.add(0,5);
        System.out.println("Test case 3: Expected: 5, Actual: " + result3);

        //Test Case 4: Edge case (large numbers)
        int result4 = calculator.add(1000000, 2000000);
        System.out.println("Test case 4: Expected: 3000000, Actual: " + result4);

        //Multiply; Test Case 1
        int result5 = calculator.multiply(4, 5);
        System.out.println("Test case 5: Expected: 20, Actual: " + result5);
    }
}
