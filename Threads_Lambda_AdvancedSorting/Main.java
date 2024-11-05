package Threads_Lambda_AdvancedSorting;

//by implementing the Runnable interface
public class Main implements Runnable{
    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread.");
    }
    public void run(){
        System.out.println("This code is running in a thread.");
    }
}

/*
public class Main extends Thread {
    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println("This code is outside of the thread.");
    }
    public void run(){
        System.out.println("This code is running in a thread.");
    }
}
*/