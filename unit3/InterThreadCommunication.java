/* WAP to create two threads. Odd threads print odd number and even number. Output must be generated 
sequentially 1,2,3,4...
(Use : wait and notify - Inter Thread Communication APT).*/
import java.beans.EventHandler;

import org.w3c.dom.events.Event;

class NumberPrinting{

    boolean isOdd = false;

    public synchronized void printOdd(int i){
        while(isOdd){
            try{
                wait();
            }catch(Exception e){}
        }
        System.out.println("Odd : " + i);
        isOdd = true;
        notify();
    }
    public synchronized void printEven(int i){
        while(!isOdd){
            try{
                wait();
            }catch(Exception e){}
        }
        System.out.println("Even : " + i);
        isOdd = false;
        notify();
    }
}

class OddThread extends Thread{
    NumberPrinting n;
    OddThread(NumberPrinting n1){
        n = n1;
    }
    public void run(){
        for(int i=1;i<=20;i=i+2){
            n.printOdd(i);
            try{
                Thread.sleep(500);
            }catch(Exception e){

            }
        }
    }
}
class EvenThread extends Thread{
    NumberPrinting n;
    EvenThread(NumberPrinting n1){
        n = n1;
    }
    public void run(){
        for(int i=2;i<=20;i=i+2){
            n.printEven(i);
            try{
                Thread.sleep(500);
            }catch(Exception e){

            }
        }
    }
}
class ITCTest{
    public static void main(String[] args) {
        NumberPrinting n1 = new NumberPrinting();
        OddThread o1 = new OddThread(n1);
        EvenThread e1 = new EvenThread(n1);
        e1.start();
        o1.start();
    }
}
