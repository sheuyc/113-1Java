public class ATMTest {
    public static void main(String[] args) {
        // 建立客戶與帳戶
        Customer customer1 = new Customer("C001", "Alice", "1234", "A001");
        Account account1 = new Account(customer1.getAccountId(), 5000.0);

        // 存提款操作
        try {
            account1.deposit(1000);
            account1.withdraw(3000);
            account1.withdraw(5000);  // 餘額不足，觸發例外
        } catch (InsufficientBalanceException e) {
            System.out.println("錯誤： " + e.getMessage());
        }

        // 列出交易記錄
        System.out.println("Transaction Log:");
        for (String log : account1.getTransactionLog()) {
            System.out.println(log);
        }

        // 建立ATM系統並加入隊列
        ATMSystem atmSystem = new ATMSystem();
        atmSystem.addCustomerToQueue(customer1);
        Customer servedCustomer = atmSystem.serveNextCustomer();
        System.out.println("Serving customer: " + servedCustomer.getName());
    }
}
