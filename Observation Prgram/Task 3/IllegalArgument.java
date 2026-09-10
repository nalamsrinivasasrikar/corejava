package exceptions;
public class IllegalArgument{
    private double balance;

    public void deposit(double amount) {
        // Validate input state
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero. Provided: " + amount);
        }
        this.balance += amount;
    }

    public static void main(String[] args) {
    	IllegalArgument account = new IllegalArgument();
        try {
            account.deposit(500);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation: " + e.getMessage());
        }
    }
}

