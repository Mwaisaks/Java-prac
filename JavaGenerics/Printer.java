import java.io.Serializable;

public class Printer <T>{
    T thingToPrint;

    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}

/*
//you can also extend a class or interface or both at the same time
public class Printer < T extends  Animal>{ }

public class Printer < T extends Serializable> { }

public class Printer < T extends Animal & Serializable> { }
//Use ampersand and one class, which comes before interface
*/