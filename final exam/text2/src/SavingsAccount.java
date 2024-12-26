public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.03; // 年利率

    public SavingsAccount(String accountId, double initialBalance) {
        super(accountId, initialBalance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}