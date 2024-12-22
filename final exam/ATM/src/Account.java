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
        logTransaction("存款： " + amount);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        System.out.println("目前餘額：" + balance + "，嘗試提款：" + amount); // 調試輸出
        if (amount > balance) {  // 如果提款金額超過目前餘額
            throw new InsufficientBalanceException("餘額不足，無法提款。");
        }
        balance -= amount;  // 扣除提款金額
        logTransaction("提款：" + amount);  // 記錄交易
        System.out.println("提款成功，剩餘餘額：" + balance); // 調試輸出
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