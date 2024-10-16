


// Interface
public interface Animal1 {
    //method with no bodies
    public void eat();
    public void sleep();
    public void mate();
}

//Pig implements the Animal interface
class Pig implements Animal1{
    public void eat(){
        System.out.println("I eat crap and dogshit for a living :) ");
    }

    public void sleep(){
        System.out.println("Zzzzz! ");
    }

    public void mate(){
        System.out.println("I'm corny asf!");
    }
}

//the main class
class Main{
    public static void main(String[] args){
        Pig myPig = new Pig();
        myPig.eat();
        myPig.sleep();
        myPig.mate();
    }
    
}

 /* 

//multiple Interfaces

//1st Interface
public interface Animal1 {
    public void speak();
    public void sing
}

//2nd Interface
public 

//3rd Interface

//implement all Interfaces

//add an additional method here

//main class
*/