/**
 * SavingsAccount 類別，表示一個儲蓄帳戶。
 * 儲蓄帳戶具有固定的年利率，並且可以計算基於餘額的利息。
 */
public class SavingsAccount extends Account {
    // 常數，定義儲蓄帳戶的固定年利率（3%）
    private static final double INTEREST_RATE = 0.03;

    /**
     * 建構子，用於初始化儲蓄帳戶。
     *
     * @param accountId      帳戶 ID
     * @param initialBalance 初始餘額
     */
    public SavingsAccount(String accountId, double initialBalance) {
        // 呼叫父類別的建構子，設定帳戶 ID 和初始餘額
        super(accountId, initialBalance);
    }

    /**
     * 計算儲蓄帳戶的年利息。
     *
     * @return 基於餘額和利率計算的利息金額
     */
    @Override
    public double calculateInterest() {
        // 利息 = 餘額 * 年利率
        return getBalance() * INTEREST_RATE;
    }
}
