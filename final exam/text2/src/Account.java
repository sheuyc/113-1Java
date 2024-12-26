import java.io.Serializable;
import java.util.Date;

public abstract class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    private String accountId;
    private double balance;
    private Date creationDate;

    public Account(String accountId, double initialBalance) {
        this.accountId = accountId;
        this.balance = initialBalance;
        this.creationDate = new Date();
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient funds.");
        }
        balance -= amount;
    }

    public abstract double calculateInterest();

    @Override
    public String toString() {
        return "Account ID: " + accountId + ", Balance: " + balance;
    }
}
