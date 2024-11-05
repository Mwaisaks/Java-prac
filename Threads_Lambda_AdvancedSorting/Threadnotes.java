//Threads allows a program to perform multiple tasks concurrently
package Threads_Lambda_AdvancedSorting;
//Thread creation
//1. Extending the thread class and overriding its run method
/*  
To run the thread, create an instance of the class and call its start() method 
public class Threadnotes extends Thread{
    public static void main(String[] args){
        Main thread = new Main();
        thread.start();
        System.out.println("This code is outside of the thread.")
    }
    public void run(){
        //code to be executed
        System.out.println("Thread is running.");
    }
}
*/  
//2. implementing the Runnable interface
public class Threadnotes implements Runnable {
    //to run the thread , pass an instance of the class to a Thread object's
    //constructor an calling its start() method.
    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outide of the thread.");
    }
    public void run(){
        //code to be executed
        System.out.println("Thread is running.");
    }
}

