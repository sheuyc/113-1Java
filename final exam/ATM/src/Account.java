import java.util.ArrayList;

public class Account implements AccountOperations, TransactionLogger {
    private String accountId;
    private double balance;
    private ArrayList<String> transactionLog;

    public Account(String accountId, double initialBalance) {
        this.accountId = accountId;
        this.balance = initialBalance;
        this.transactionLog = new ArrayList<>();
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        logTransaction("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        logTransaction("Withdrew: " + amount);
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void logTransaction(String message) {
        transactionLog.add(message);
    }

    @Override
    public ArrayList<String> getTransactionLog() {
        return transactionLog;
    }
}