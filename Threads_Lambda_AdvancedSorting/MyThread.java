package Threads_Lambda_AdvancedSorting;

public class MyThread {
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

        
    }
}

/*
 * When the JVM starts there's a thread called main that calls the main method
 * 
 */