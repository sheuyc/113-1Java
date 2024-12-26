import java.util.HashSet;

/**
 * DataStore 類別，用於管理用戶數據的儲存和檢索。
 * 使用 HashSet 存儲用戶數據，確保用戶 ID 唯一。
 */
public class DataStore {
    private HashSet<User> users; // 用於存儲用戶的集合

    /**
     * 建構子，初始化用戶集合並加載預設數據。
     */
    public DataStore() {
        this.users = new HashSet<>(); // 初始化 HashSet
        initializeData(); // 加載預設數據
    }

    /**
     * 添加新用戶到資料庫。
     *
     * @param user 要添加的用戶物件
     * @throws IllegalArgumentException 當用戶 ID 已存在時拋出
     */
    public void addUser(User user) {
        // 如果添加失敗，表示用戶 ID 已存在
        if (!users.add(user)) {
            throw new IllegalArgumentException("用戶 ID 已存在！");
        }
    }

    /**
     * 根據用戶 ID 查找用戶。
     *
     * @param userId 要查找的用戶 ID
     * @return 如果找到對應的用戶，返回 User 物件；否則返回 null
     */
    public User findUser(String userId) {
        // 遍歷用戶集合，匹配 ID
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user; // 返回匹配的用戶
            }
        }
        return null; // 未找到則返回 null
    }

    /**
     * 獲取所有用戶的集合。
     *
     * @return 包含所有用戶的 HashSet
     */
    public HashSet<User> getAllUsers() {
        return users;
    }

    /**
     * 初始化預設數據，包括添加示例用戶和帳戶。
     */
    private void initializeData() {
        // 創建預設用戶
        User user1 = new User("001", "Alice", "1234");
        User user2 = new User("002", "Bob", "5678");

        // 為用戶添加帳戶
        user1.addAccount(new SavingsAccount("SA1", 5000.0)); // 儲蓄帳戶
        user1.addAccount(new CheckingAccount("CA1", 2000.0)); // 支票帳戶

        user2.addAccount(new SavingsAccount("SA2", 10000.0)); // 儲蓄帳戶

        // 將用戶添加到系統
        addUser(user1);
        addUser(user2);
    }
}
