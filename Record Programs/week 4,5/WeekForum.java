package recordprog;
//Customer class
class Customer {
 private String name;
 private String location;

 public Customer(String name, String location) {
     this.name = name;
     this.location = location;
 }

 public void sendOrder(Order order) {
     System.out.println(name + " from " + location + " is sending order " + order.getNumber());
 }

 public void receiveOrder(Order order) {
     System.out.println(name + " received order " + order.getNumber());
 }
}

//Base Order class
class Order {
 private String date;
 private String number;

 public Order(String date, String number) {
     this.date = date;
     this.number = number;
 }

 public void confirm() {
     System.out.println("Order " + number + " confirmed.");
 }

 public void close() {
     System.out.println("Order " + number + " closed.");
 }

 public String getNumber() {
     return number;
 }
}

//SpecialOrder inherits from Order
class SpecialOrder extends Order {
 public SpecialOrder(String date, String number) {
     super(date, number);
 }

 public void dispatch() {
     System.out.println("Special order " + getNumber() + " dispatched.");
 }
}

//NormalOrder inherits from Order
class NormalOrder extends Order {
 public NormalOrder(String date, String number) {
     super(date, number);
 }

 public void dispatch() {
     System.out.println("Normal order " + getNumber() + " dispatched.");
 }

 public void receive() {
     System.out.println("Normal order " + getNumber() + " received.");
 }
}

//Main class renamed as WeekFouruml
public class WeekForum {
 public static void main(String[] args) {
     Customer c1 = new Customer("Srikar", "Visakhapatnam");

     SpecialOrder so = new SpecialOrder("2026-08-10", "SO123");
     NormalOrder no = new NormalOrder("2026-08-10", "NO238");

     c1.sendOrder(so);
     so.confirm();
     so.dispatch();
     so.close();

     c1.sendOrder(no);
     no.confirm();
     no.dispatch();
     no.receive();
     no.close();

     c1.receiveOrder(no);
 }
}