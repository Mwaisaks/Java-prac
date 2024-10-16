abstract class Animal{
    //abstract method
    public abstract void animalSound();
    //regular method
    public void sleep(){
        System.out.println("Zzzzz!");
    }
}

class Pig extends Animal{
    public void animalSound(){
        //the body of animal sound is provided here
        System.out.println("The dog says bow wow!");
        System.out.println("The cat says meow! meow!");
        System.out.println("The pig says 'I'll start tomorrow!' ");
    }
}

class Main{
    public static void main(String[] args){
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}