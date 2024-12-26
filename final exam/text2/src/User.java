import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User 類別，表示銀行系統中的一個用戶。
 * 支援管理帳戶、交易記錄和最近活動的功能。
 * 實現 Serializable 接口，便於數據持久化。
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L; // 用於序列化的版本控制

    private String id;                            // 用戶 ID（唯一標識）
    private String name;                          // 用戶姓名
    private String password;                      // 用戶密碼
    private ArrayList<Account> accounts;          // 用戶的帳戶列表
    private ArrayList<TransactionRecord> transactionHistory; // 用戶的交易記錄
    private LinkedList<String> recentActivities; // 最近的用戶活動，最多保存 10 條

    /**
     * 建構子，初始化用戶的基本信息和數據結構。
     *
     * @param id       用戶 ID
     * @param name     用戶姓名
     * @param password 用戶密碼
     */
    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.accounts = new ArrayList<>(); // 初始化帳戶列表
        this.transactionHistory = new ArrayList<>(); // 初始化交易記錄列表
        this.recentActivities = new LinkedList<>(); // 初始化最近活動列表
    }

    /**
     * 設置新的用戶密碼。
     *
     * @param password 新密碼
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 日誌活動，記錄用戶的操作，保存到最近活動列表中。
     * 僅保存最近的 10 條活動記錄。
     *
     * @param activity 要記錄的活動描述
     */
    private void logActivity(String activity) {
        // 格式化時間戳
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestamp = formatter.format(new Date());

        // 添加到最近活動的最前面
        recentActivities.addFirst("[" + timestamp + "] " + activity);

        // 保持最近活動數量不超過 10 條
        if (recentActivities.size() > 10) {
            recentActivities.removeLast();
        }
    }

    /**
     * 獲取用戶 ID。
     *
     * @return 用戶 ID
     */
    public String getId() {
        return id;
    }

    /**
     * 獲取用戶姓名。
     *
     * @return 用戶姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 驗證用戶密碼。
     *
     * @param inputPassword 用戶輸入的密碼
     * @return 如果密碼正確，返回 true；否則返回 false
     */
    public boolean verifyPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    /**
     * 添加帳戶到用戶的帳戶列表。
     *
     * @param account 要添加的帳戶
     */
    public void addAccount(Account account) {
        accounts.add(account);
    }

    /**
     * 獲取用戶的帳戶列表。
     *
     * @return 帳戶列表
     */
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    /**
     * 添加交易記錄到交易歷史。
     *
     * @param record 要添加的交易記錄
     */
    public void addTransaction(TransactionRecord record) {
        transactionHistory.add(record);
    }

    /**
     * 獲取用戶的交易歷史。
     *
     * @return 交易記錄列表
     */
    public ArrayList<TransactionRecord> getTransactionHistory() {
        return transactionHistory;
    }

    /**
     * 獲取用戶的最近活動列表。
     *
     * @return 最近活動的鏈結列表
     */
    public LinkedList<String> getRecentActivities() {
        return recentActivities;
    }

    /**
     * 檢查用戶是否相等，基於 ID 進行判斷。
     *
     * @param o 另一個要比較的物件
     * @return 如果 ID 相等，返回 true；否則返回 false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 如果是同一物件，返回 true
        if (o == null || getClass() != o.getClass()) return false; // 類型不匹配，返回 false
        User user = (User) o;
        return Objects.equals(id, user.id); // 基於 ID 判斷是否相等
    }

    /**
     * 計算用戶的哈希碼，基於 ID。
     *
     * @return 哈希碼
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * 返回用戶的基本信息（ID 和姓名）。
     *
     * @return 用戶的字串表示
     */
    @Override
    public String toString() {
        return "User ID: " + id + ", Name: " + name;
    }
}
