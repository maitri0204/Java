/* WAP to create a child thread(by mplementing runnable interface) which prints greeting message */
import java.util.*;

class ChildThread1 implements Runnable{
    /*
     * Task to be executed by thread..Override run method of thread class
     */
    public void run(){
        for(int i=1; i<=50; i++){
            System.out.println("Welcome from: " + Thread.currentThread().getName() +" " + i);
        }
    }
}

public class ThreadTest3{
    public static void main(String[] args) {
        System.out.println("Threading Test Example!!");
        ChildThread1 thread1 = new ChildThread1();
        Thread t1 = new Thread(thread1); //Thread t1 = new Thread(new ChildThread1());

        t1.setName("ChildThread1");
        t1.setDaemon(true);
        t1.start(); // State changes from new to runnable

        for(int i=51; i<=100; i++){
            System.out.println("Greetings from: " + Thread.currentThread().getName() + " " + i);
        }
        System.out.println("********** GOODBYE ****************************************");
    }
}