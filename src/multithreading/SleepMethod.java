package multithreading;

public class SleepMethod implements Runnable{
    @Override
    public void run(){
        System.out.println("current thread "+Thread.currentThread().getName());
        System.out.println("in run method");
    }

    public static void main(String[] args) {
        SleepMethod sleepMethod = new SleepMethod();
        Thread thread = new Thread(sleepMethod);
        thread.start();
        thread.run();
        sleepMethod.run();

    }
}
