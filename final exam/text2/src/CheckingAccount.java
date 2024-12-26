/**
 * CheckingAccount 類別繼承自 Account 類別，表示一種支票帳戶。
 * 支票帳戶具有透支限額，允許帳戶餘額低於零但不超過一定範圍。

public class CheckingAccount extends Account {
    // 定義透支限額，常數值設為 100.0
    private static final double OVERDRAFT_LIMIT = 100.0;

    /**
     * 建構子，用於初始化支票帳戶。
     *
     * @param accountId      帳戶 ID
     * @param initialBalance 初始餘額

    public CheckingAccount(String accountId, double initialBalance) {
        // 呼叫父類別的建構子，初始化帳戶 ID 和餘額
        super(accountId, initialBalance);
    }

    /**
     * 覆寫 withdraw 方法，實現支票帳戶的特定提款邏輯。
     * 檢查提款後是否超出透支限額，如果是則拋出異常。
     *
     * @param amount 提款金額
     * @throws Exception 當提款超過透支限額時拋出

    @Override
    public void withdraw(double amount) throws Exception {
        // 檢查提款後餘額是否超過透支限額
        if (getBalance() - amount < -OVERDRAFT_LIMIT) {
            throw new Exception("超出透支限額。");
        }
        // 如果合法，呼叫父類別的 withdraw 方法執行提款操作
        super.withdraw(amount);
    }

    /**
     * 覆寫 calculateInterest 方法，定義支票帳戶的利息計算方式。
     * 支票帳戶不會產生利息，因此直接返回 0。
     *
     * @return 利息，支票帳戶固定為 0

    @Override
    public double calculateInterest() {
        return 0; // 支票帳戶無利息
    }
}
*/
