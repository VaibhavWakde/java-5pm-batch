package multithreading;

public class BankTransactions {
    int balance = 1000;
    synchronized void withdraw(int amount) {
        System.out.println("in withdraw method");
        if (balance >= amount){
            balance = balance - amount;
            System.out.println("Remaining Balance : "+ balance);
        }
        else {
            System.out.println("Waiting for deposit");
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            balance = balance - amount; // becoz after wait relese execution start where it stops
            System.out.println("Amount Withdraw : "+ balance);
            System.out.println("Transaction Complelte");
        }
    }

    synchronized void deposit(int amount){
        System.out.println("in deposit method");
        balance = balance + amount;
        System.out.println("outstanding balance "+balance);
        notify();
    }
}

class BankTransactionImpl {
    public static void main(String[] args) {
        BankTransactions bankTransactions = new BankTransactions();
        BankThread1 th1 = new BankThread1(bankTransactions);
        BankThread2 th2 = new BankThread2(bankTransactions);

        th1.start();
        th2.start();
    }
}

class BankThread1 extends Thread {
    BankTransactions bankTransactions;
    BankThread1(BankTransactions bankTransactions){
        this.bankTransactions = bankTransactions;
    }

    @Override
    public void run() {
        bankTransactions.withdraw(2000);
    }
}

class BankThread2 extends Thread {
    BankTransactions bankTransactions;
    BankThread2(BankTransactions bankTransactions){
        this.bankTransactions = bankTransactions;
    }

    @Override
    public void run() {
        bankTransactions.deposit(3000);
    }
}
