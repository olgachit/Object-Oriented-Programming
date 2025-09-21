import java.math.BigInteger;

class Theater {
    private int availableSeats;

    public Theater(int seats) {
        this.availableSeats = seats;
    }

    public synchronized boolean reserveSeats(int amount, int id) {
        if (amount <= availableSeats) {
            availableSeats -= amount;
            System.out.println("Customer " + id + " reserved " + amount + " tickets.");
            return true;
        } else {
            System.out.println("Customer " + id + " couldn't reserve " + amount + " tickets.");
            return false;
        }
    }
}

class Customer extends Thread {
    private static int id;
    private int ticketsRequested;
    private Theater theater;

    public Customer(Theater theater, int ticketsRequested, int id) {
        this.theater = theater;
        this.ticketsRequested = ticketsRequested;
        this.id = id;
    }

    public void run() {
        theater.reserveSeats(ticketsRequested, id);
    }
}

public class Task1 {
    public static void main(String[] args) {
        int totalSeats = 10;
        Theater theater = new Theater(totalSeats);
        Customer[] customers = new Customer[5];
        customers[0] = new Customer(theater, 4, 1);
        customers[1] = new Customer(theater, 3, 2);
        customers[2] = new Customer(theater, 5, 3);
        customers[3] = new Customer(theater, 2, 4);
        customers[4] = new Customer(theater, 1, 5);
        for (Customer customer : customers) {
            customer.start();
        }
    }
}