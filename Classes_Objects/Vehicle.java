class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound!");

    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: I'll start tomorrow :)");

    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog say bow wow!");
    }
}

class Vehicle{
    public static void main(String[] args){
        Animal myAnimal = new Animal();
        Animal myPig = new Pig(); //is this how classes are called
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}


/*class Vehicle{
    protected String Brand = "Ford";

    public void honk(){
        System.out.println("Tuut! Tuut!");
    }
}

class Car extends Vehicle{
    private String modelName = "Mustang";

    public static void main(String[] args){
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.Brand + " " + myFastCar.modelName);
    }
}
*/


/*import java.util.Scanner;
public class Apii {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username: ");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
*/