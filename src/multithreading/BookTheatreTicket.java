package multithreading;

public class BookTheatreTicket {
    static  int ticketAvailable = 100;
    static synchronized void bookTicket(int tickets){
        if(ticketAvailable >=tickets){
            ticketAvailable = ticketAvailable - tickets;
            System.out.println(tickets + " tickets are booked.");
            System.out.println("Total Tickets available "+ticketAvailable);
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        else {
            System.out.println("No tickets available");
        }
    }
}

class TicketThread1 extends Thread {
    BookTheatreTicket b1;
    int tickets;
    TicketThread1(BookTheatreTicket b1, int tickets){
        this.b1 = b1;
        this.tickets = tickets;
    }

    @Override
    public void run() {
        b1.bookTicket(tickets);
    }
}

class TicketThread2 extends Thread{
    BookTheatreTicket b2;
    int tickets;
    TicketThread2(BookTheatreTicket b2, int tickets){
        this.b2 = b2;
        this.tickets = tickets;
    }

    @Override
    public void run() {
        b2.bookTicket(tickets);
    }
}

class BookTheatreTicketImpl {
    public static void main(String[] args) {
        BookTheatreTicket bt1 = new BookTheatreTicket();
        TicketThread1 t1 = new TicketThread1(bt1,40); // 60 available
        TicketThread2 t2 = new TicketThread2(bt1, 40); // 20 available

        BookTheatreTicket bt2 = new BookTheatreTicket();
        TicketThread1 t3 = new TicketThread1(bt2, 20); // 0 available
        TicketThread2 t4 = new TicketThread2(bt2,40); // No tickets available

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
