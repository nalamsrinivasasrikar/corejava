package recordprog;
class Reservation {
    private int availableSeats = 10;
    public synchronized void reserveSeats(String passenger, int seats) {

        System.out.println( passenger + " requested " + seats + " seats." );

        if (seats <= availableSeats) {
            availableSeats -= seats;

            System.out.println( seats + " seats reserved for " + passenger);

            System.out.println( "Available seats: " + availableSeats );
        } else {
            System.out.println("Sorry, " + passenger+ ". Not enough seats available." );
        }
    }
}
class Passenger extends Thread {
    private Reservation reservation;
    private int seats;
    public Passenger(
            Reservation reservation,
            String name,
            int seats) {
        super(name);
        this.reservation = reservation;
        this.seats = seats;
    }
    @Override
    public void run() {
        reservation.reserveSeats(getName(), seats);
    }
}
public class Experiment12 {
    public static void main(String[] args)
            throws InterruptedException {
        Reservation reservation = new Reservation();
        Passenger p1 =
            new Passenger(reservation, "Alice", 5);
        Passenger p2 =
            new Passenger(reservation, "Bob", 2);
        Passenger p3 =
            new Passenger(reservation, "Charlie", 4);
        p1.start();
        p2.start();
        p3.start();
        p1.join();
        p2.join();
        p3.join();
        System.out.println("Reservation process completed.");
    }
}
