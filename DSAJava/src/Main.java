public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Addition" + add(5, 9));
        System.out.println("Multiplication: " + multiply(5, 9));
    }


    public static int add(int a, int b){
        return a + b;
    }

    public static int multiply(int x, int y){
        return x * y;
    }
}