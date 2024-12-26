import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.text.SimpleDateFormat;
import java.util.Date;


public class User implements Serializable {
    private static final long serialVersionUID = 1L; // 建議添加序列版本 ID
    private String id;
    private String name;
    private String password;
    private ArrayList<Account> accounts;
    private ArrayList<TransactionRecord> transactionHistory;
    private LinkedList<String> recentActivities;

    public void setPassword(String password) {
        this.password = password;
    }



    private void logActivity(String activity) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestamp = formatter.format(new Date()); // 格式化日期和時間
        recentActivities.addFirst("[" + timestamp + "] " + activity);
        if (recentActivities.size() > 10) {
            recentActivities.removeLast();
        }
    }


    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.accounts = new ArrayList<>();
        this.transactionHistory = new ArrayList<>();
        this.recentActivities = new LinkedList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean verifyPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addTransaction(TransactionRecord record) {
        transactionHistory.add(record);
    }

    public ArrayList<TransactionRecord> getTransactionHistory() {
        return transactionHistory;
    }

    public LinkedList<String> getRecentActivities() {
        return recentActivities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User ID: " + id + ", Name: " + name;
    }
}
