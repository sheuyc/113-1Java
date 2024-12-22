public class Customer extends User {
    private String accountId;

    public Customer(String userId, String name, String password, String accountId) {
        super(userId, name, password);
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }
}