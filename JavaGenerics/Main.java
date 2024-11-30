public class Main {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<Double> dPrinter = new Printer<>(56.7);
        dPrinter.print();

        //shout("John", 74);

        //Uses wrapper classes
        //Common example is ArrayLists
    }
}

/*
//U can also create your own methods in the Main class

private static <T> void shout(T thingToShout){
    System.out.println(thingToShout + "!!!!");
}

To take two types;
private static void shout(T thing ToShout, V otherThingToShout){
    System.out.println(thingToShout + "!!!!";
    System.out.println(otherThingToShout + "!!!!";

}
 */