package myprogs.basics;

class DataShow {
    int x = 5, y = 2;

    void division() {
        System.out.println("Division is: " + (x / y));
    }
}

public class NewProg {
    public static void main(String[] args) {
        int x = 10, y = 15;

        System.out.println("Multiplication is: " + (x * y));

        DataShow ds = new DataShow();
        ds.division();
    }
}