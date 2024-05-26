class Store{
    int value;
    boolean isProduced = false;

    public synchronized void produce(int value){
        while(isProduced){
            try{
                wait();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        isProduced = true;
        this.value = value;
        System.out.println("Ordered Place : " + value);
        notify();
    }

    public synchronized int consume(){
        while(!isProduced){
            try{
                wait();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        isProduced = false;
        System.out.println("Delivered Order : " + value); 
        notify();
        return value;
    }
}

class Producer extends Thread{
    Store s;
    Producer(Store s){
        this.s = s;
    }

    public void run(){
        for(int i=1;i<=5;i++){
            s.produce(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }
}

class Consumer extends Thread{
    Store s;
    Consumer(Store s){
        this.s = s;
    }

    public void run(){
        for(int i=1;i<=5;i++){
            int v = s.consume();
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                
            }
        }
    }
}

class ProducerConsumerSync{
    public static void main(String[] args) {
        Store s = new Store();
        Producer p1 = new Producer(s);
        Consumer c1 = new Consumer(s);

        p1.start();
        c1.start();
    }
}