//private inner class

import java.util.Scanner;

class OuterClass{
    Scanner keyboard = new Scanner(System.in);
    public String input;

    public OuterClass(){
        System.out.print("Wazazi wako hawako? ");
        input = keyboard.nextLine();
    
    }
    
    class InnerClass{
        String x = "Did you know you have 30 minutes??!!!!";
        
    }
}

public class Inner{
    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        // System.out.println(myOuter.input);
        System.out.println(myInner.x + "yes 30 minutes!!!"); 
    }
}


/*public class Inner{
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);

    }
}

class OuterClass {
    int x = 10;

    class InnerClass{
        private int y = 5; // generates an error coz of private access modifier
    }
}
*/