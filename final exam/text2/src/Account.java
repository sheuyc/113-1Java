import java.io.Serializable;
import java.util.Date;

/**
 * 抽象類別 Account 表示一個通用的銀行帳戶。
 * 此類別實現了 Serializable 接口，支援物件序列化。
 * 每個帳戶都有唯一的 ID、餘額和建立日期。
 * 抽象方法 calculateInterest 由子類別實現，用於計算特定帳戶類型的利息。
 */

public abstract class Account implements Serializable {
    // 序列化版本 ID，用於物件序列化的版本控制
    private static final long serialVersionUID = 1L;
    private String accountId; // 帳戶的唯一識別碼
    private double balance;   // 帳戶餘額
    private Date creationDate; // 帳戶建立日期

    /**
     * 建構子，用於初始化帳戶。
     *
     * @param accountId      帳戶 ID
     * @param initialBalance 初始餘額
     */


    public Account(String accountId, double initialBalance) {
        this.accountId = accountId; // 設置帳戶 ID
        this.balance = initialBalance; // 設置初始餘額
        this.creationDate = new Date(); // 設置帳戶建立日期為當前時間
    }
    /**
     * 取得帳戶 ID。
     *
     * @return 帳戶的唯一識別碼
     */

    public String getAccountId() {
        return accountId;
    }

    /**
     * 取得帳戶餘額。
     *
     * @return 帳戶目前的餘額
     */

    public double getBalance() {
        return balance;
    }

    /**
     * 存款方法，用於將指定金額存入帳戶。
     *
     * @param amount 存款金額
     * @throws IllegalArgumentException 如果存款金額小於等於零
     */

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("存款金額必須大於零。");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("資金不足。");
        }
        balance -= amount; // 增加餘額
    }

    /**
     * 提款方法，用於從帳戶中提取指定金額。
     *
     * @param amount 提款金額
     * @throws Exception 如果提款金額超過餘額
     */

    public abstract double calculateInterest();

    /**
     * 返回帳戶的基本信息，包括帳戶 ID 和餘額。
     *
     * @return 帳戶信息的字串表示
     */

    @Override
    public String toString() {
        return "帳戶ID " + accountId + ", 餘額： " + balance;
    }
}
