import java.util.Scanner;

public class GenericMethod {

    public static <T> void printArray(T[] array) {
        for (T element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] stringArray = {"A", "B", "C"};
        Integer[] intArray = {1,2,3};

        System.out.println("Printing the String Array: ");
        printArray(stringArray);

        System.out.println("Press enter to print the Integer Array...");
        scanner.nextLine();

        System.out.println("Printing the Integer Array: ");
        printArray(intArray);

        scanner.close();
    }
}
