package W_Exception_Handling;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void makePayment(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Transaction failed: Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Payment of $" + amount + " successful. Remaining balance: $" + balance);
    }
}

public class l_insufficient_balance_check_exception {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(500);

        try {
            userAccount.makePayment(600);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
