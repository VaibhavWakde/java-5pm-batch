package multithreading;

public class ThreadPriorityDemo extends Thread{
    @Override
    public void run() {
        System.out.println("in run method");
        System.out.println("current thread "+Thread.currentThread().getName());
    }
}

class ThreadPriorityImpl {
    public static void main(String[] args) {
        ThreadPriorityDemo th1 = new ThreadPriorityDemo();
        ThreadPriorityDemo th2 = new ThreadPriorityDemo();
        ThreadPriorityDemo th3 = new ThreadPriorityDemo();

        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.MAX_PRIORITY);

        th1.start();
        th2.start();
        System.out.println("before setting priority th1 "+th1.getPriority());
        System.out.println("before setting priority th2 "+th2.getPriority());



        System.out.println("after setting priority "+th1.getPriority());
    }
}
