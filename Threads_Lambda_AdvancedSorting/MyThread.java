package Threads_Lambda_AdvancedSorting;

public class MyThread implements Runnable {
    @Override
    public void run(){
     //System.out.println("Thread is running");
    }
    public static void main(String[] args) {
      
        //to find out how many threads are running
        //System.out.println(Thread.activeCount());

        //set thread name
        //Thread.currentThread().setName("Maloc");
        //get thread's name
        //System.out.println(Thread.currentThread().getName());
        
        //setting and getting priority
        //Thread.currentThread().setPriority(7);
        //System.out.println(Thread.currentThread().getPriority());

        //find out if it's running
        System.out.println(Thread.currentThread().isAlive());

        MyThread thread2 = new MyThread();
        thread2.start();

        System.out.println(thread2.isAlive());
    }
}

/*
 * When the JVM starts there's a thread called main that calls the main method
 * 
 * Let's talk about threads in java
Talk about the 2 methods of thread creation and how each runs
The methods in Threads Class i.e.
activeCount()
getName() and setName()
getPriority ans setPriority()
.currentThread()
isAlive
and other relevant methods 
Talk about running two threads at the same time
 */