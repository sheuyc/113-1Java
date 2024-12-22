public class ATMTest {
    public static void main(String[] args) {
        // 建立客戶與帳戶
        Customer customer1 = new Customer("C001", "Alice", "1234", "A001");
        Account account1 = new Account(customer1.getAccountId(), 5000.0);

        // 存款與提款操作
        try {
            account1.deposit(1000); // 存款
            account1.withdraw(3000); // 提款
            account1.withdraw(5000); // 嘗試超額提款，觸發例外
        } catch (InsufficientBalanceException e) {
            System.out.println("錯誤：" + e.getMessage());
        }

        // 列出交易記錄
        System.out.println("交易記錄：");
        for (String log : account1.getTransactionLog()) {
            System.out.println(log);
        }

        // 管理ATM客戶排隊
        ATMSystem atmSystem = new ATMSystem();
        atmSystem.addCustomerToQueue(customer1); // 客戶加入隊列
        Customer servedCustomer = atmSystem.serveNextCustomer(); // 處理下一位客戶
        System.out.println("正在服務的客戶：" + servedCustomer.getName());
    }
}
