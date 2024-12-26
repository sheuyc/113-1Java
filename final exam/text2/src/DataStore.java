import java.util.HashSet;

public class DataStore {
    private HashSet<User> users;

    public DataStore() {
        this.users = new HashSet<>();
        initializeData(); // 初始化預設數據
    }

    public void addUser(User user) {
        if (!users.add(user)) {
            throw new IllegalArgumentException("用戶 ID 已存在！");
        }
    }

    public User findUser(String userId) {
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    public HashSet<User> getAllUsers() {
        return users;
    }

    // 初始化預設數據
    private void initializeData() {
        // 添加預設用戶
        User user1 = new User("001", "Alice", "1234");
        User user2 = new User("002", "Bob", "5678");

        // 添加帳戶到用戶
        user1.addAccount(new SavingsAccount("SA1", 5000.0));
        user1.addAccount(new CheckingAccount("CA1", 2000.0));

        user2.addAccount(new SavingsAccount("SA2", 10000.0));

        // 添加用戶到系統
        addUser(user1);
        addUser(user2);
    }
}
