public interface AccountOperations {
    void deposit(double amount);  // 存款
    void withdraw(double amount) throws InsufficientBalanceException;  // 提款
    double checkBalance();  // 查詢餘額
}
