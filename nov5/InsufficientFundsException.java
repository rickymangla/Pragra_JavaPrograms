package nov5;

public class InsufficientFundsException extends Exception{

    private double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public InsufficientFundsException(String message) {
        super(message);
    }


    public double getAmount() {
        return amount;
    }
}
