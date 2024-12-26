public class CheckingAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 100.0;

    public CheckingAccount(String accountId, double initialBalance) {
        super(accountId, initialBalance);
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (getBalance() - amount < -OVERDRAFT_LIMIT) {
            throw new Exception("Overdraft limit exceeded.");
        }
        super.withdraw(amount);
    }

    @Override
    public double calculateInterest() {
        return 0; // 支票帳戶無利息
    }
}
