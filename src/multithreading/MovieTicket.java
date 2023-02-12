package multithreading;

public class MovieTicket {
    static int totalTickets = 100;
    static synchronized void bookTicket(int seats){
        if(totalTickets>=seats){
            System.out.println(seats + " are going to book");
            totalTickets = totalTickets - seats;
            System.out.println("Ticket left "+totalTickets);
        }
        else {
            System.out.println("No tickets available");
        }
    }
}

class MyThread1 extends Thread {
    int seats;
    MovieTicket movieTicket;
    MyThread1(MovieTicket movieTicket, int seats){
        this.movieTicket=movieTicket;
        this.seats=seats;
    }

    @Override
    public void run() {
        movieTicket.bookTicket(seats);
    }
}

class MyThread2 extends Thread {
    int seats;
    MovieTicket movieTicket;
    MyThread2(MovieTicket movieTicket, int seats){
        this.movieTicket = movieTicket;
        this.seats=seats;
    }

    @Override
    public void run() {
        movieTicket.bookTicket(seats);
    }
}

class MovieTicketImpl{
    public static void main(String[] args) {
        MovieTicket m1 = new MovieTicket();
        MovieTicket m2 = new MovieTicket();

        MyThread1 t1 = new MyThread1(m1,4);
        t1.start();
        MyThread1 t2 = new MyThread1(m2,2);
        t2.start();
        MyThread2 t3 = new MyThread2(m1,1);
        t3.start();
        MyThread2 t4 = new MyThread2(m2,5);
        t4.start();
    }
}
