package multithreading;

public class ThreadYeildOne extends Thread{
    @Override
    public void run() {
        for ( int i =0;i<5;i++){
            System.out.println("in t1");
            Thread.yield();
        }
    }
}

class ThreadYeildTwo extends Thread {
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("in t2");
        }
    }
}

class ThreadImpl{
    public static void main(String[] args) {
        ThreadYeildOne th1 = new ThreadYeildOne();
        ThreadYeildTwo th2 = new ThreadYeildTwo();
        th1.start();
        th2.start();
    }
}
