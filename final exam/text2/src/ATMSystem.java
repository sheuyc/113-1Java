import java.util.Scanner;

public class ATMSystem {
    private DataStore dataStore;
    private User currentUser;

    public ATMSystem() {
        this.dataStore = new DataStore();
    }



    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("歡迎來到 ATM 銀行系統！");
        System.out.println("目前系統內已註冊用戶數：" + dataStore.getAllUsers().size());
        System.out.println("==================================");

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    register(scanner);
                    break;
                case 3:
                    System.out.println("系統已退出，感謝使用！");
                    return;
                default:
                    printError("無效選項，請重新選擇。");
            }
        }
    }



    private void login(Scanner scanner) {
        System.out.print("請輸入用戶 ID：");
        String userId = scanner.next();
        System.out.print("請輸入密碼：");
        String password = scanner.next();

        User user = dataStore.findUser(userId);
        if (user != null && user.verifyPassword(password)) {
            currentUser = user;
            printSuccess("登入成功，歡迎 " + currentUser.getName() + "！");
            userMenu(scanner);
        } else {
            printError("登入失敗，用戶名或密碼錯誤！");
        }
    }

    private void register(Scanner scanner) {
        System.out.print("請輸入用戶 ID：");
        String userId = scanner.next();
        System.out.print("請輸入用戶名：");
        String userName = scanner.next();
        System.out.print("請設置密碼：");
        String password = scanner.next();

        try {
            User newUser = new User(userId, userName, password);
            dataStore.addUser(newUser);
            printSuccess("註冊成功，請登入以開始操作！");
        } catch (IllegalArgumentException e) {
            printError("註冊失敗：" + e.getMessage());
        }
    }


    private void userMenu(Scanner scanner) {
        while (true) {
            System.out.println("請選擇操作：\n1. 查詢帳戶\n2. 開新帳戶\n3. 存款\n4. 提款\n5. 交易記錄\n6. 重置密碼\n7. 刪除帳戶\n8. 登出");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewAccounts();
                    break;
                case 2:
                    openAccount(scanner);
                    break;
                case 3:
                    deposit(scanner);
                    break;
                case 4:
                    withdraw(scanner);
                    break;
                case 5:
                    viewTransactionHistory();
                    break;
                case 6:
                    resetPassword(scanner);
                    break;
                case 7:
                    deleteAccount(scanner);
                    break;
                case 8:
                    System.out.println("登出成功！");
                    currentUser = null;
                    return;
                default:
                    System.out.println("無效選項，請重新選擇。");
            }
        }
    }


    private void resetPassword(Scanner scanner) {
        System.out.print("請輸入舊密碼：");
        String oldPassword = scanner.next();

        if (currentUser.verifyPassword(oldPassword)) {
            System.out.print("請輸入新密碼：");
            String newPassword = scanner.next();
            System.out.print("再次確認新密碼：");
            String confirmPassword = scanner.next();

            if (newPassword.equals(confirmPassword)) {
                currentUser.setPassword(newPassword);
                System.out.println("密碼重置成功！");
            } else {
                System.out.println("新密碼與確認密碼不一致！");
            }
        } else {
            System.out.println("舊密碼錯誤！");
        }
    }

    private void deleteAccount(Scanner scanner) {
        if (currentUser.getAccounts().isEmpty()) {
            System.out.println("您沒有任何帳戶可刪除！");
            return;
        }

        System.out.print("請輸入要刪除的帳戶 ID：");
        String accountId = scanner.next();

        for (Account account : currentUser.getAccounts()) {
            if (account.getAccountId().equals(accountId)) {
                currentUser.getAccounts().remove(account);
                System.out.println("帳戶刪除成功！");
                return;
            }
        }
        System.out.println("帳戶 ID 無效！");
    }


    private void viewAccounts() {
        // 檢查用戶是否有任何帳戶
        if (currentUser.getAccounts().isEmpty()) {
            System.out.println("您還沒有任何帳戶，請先開設帳戶再查看！");
            return;
        }

        System.out.println("您的帳戶列表：");
        for (Account account : currentUser.getAccounts()) {
            System.out.println(account);
        }
    }

    private void displayMenu() {
        System.out.println("\n==================================");
        System.out.println("           ATM 銀行系統          ");
        System.out.println("==================================");
        System.out.println("1. 登入");
        System.out.println("2. 註冊");
        System.out.println("3. 退出");
        System.out.println("==================================");
        System.out.print("請選擇操作：");
    }

    private void displayUserMenu() {
        System.out.println("\n==================================");
        System.out.println("       用戶功能選單              ");
        System.out.println("==================================");
        System.out.println("1. 查詢帳戶");
        System.out.println("2. 開新帳戶");
        System.out.println("3. 存款");
        System.out.println("4. 提款");
        System.out.println("5. 交易記錄");
        System.out.println("6. 重置密碼");
        System.out.println("7. 刪除帳戶");
        System.out.println("8. 登出");
        System.out.println("==================================");
        System.out.print("請選擇操作：");
    }

    private void viewActivityLog() {
        System.out.println("\n==================================");
        System.out.println("         最近活動記錄            ");
        System.out.println("==================================");
        for (String activity : currentUser.getRecentActivities()) {
            System.out.println(activity);
        }
        System.out.println("==================================");
    }

    private void printSuccess(String message) {
        System.out.println("\n[成功] " + message);
    }

    private void printError(String message) {
        System.out.println("\n[錯誤] " + message);
    }
    private void printInfo(String message) {
        System.out.println("\n[資訊] " + message);
    }



    private void openAccount(Scanner scanner) {
        System.out.println("選擇帳戶類型：\n1. 儲蓄帳戶\n2. 支票帳戶");
        int choice = scanner.nextInt();

        System.out.print("請輸入初始存款金額：");
        double initialDeposit = scanner.nextDouble();

        Account account;
        if (choice == 1) {
            account = new SavingsAccount("SA" + (currentUser.getAccounts().size() + 1), initialDeposit);
        } else {
            account = new CheckingAccount("CA" + (currentUser.getAccounts().size() + 1), initialDeposit);
        }
        currentUser.addAccount(account);
        System.out.println("帳戶開通成功：" + account);
    }

    private void deposit(Scanner scanner) {
        // 檢查用戶是否有任何帳戶
        if (currentUser.getAccounts().isEmpty()) {
            System.out.println("您還沒有任何帳戶，請先開設帳戶再進行存款操作！");
            return;
        }

        System.out.print("請選擇帳戶 ID：");
        String accountId = scanner.next();

        // 遍歷帳戶列表，匹配帳戶 ID
        for (Account account : currentUser.getAccounts()) {
            if (account.getAccountId().equals(accountId)) {
                System.out.print("請輸入存款金額：");
                double amount = scanner.nextDouble();
                account.deposit(amount);

                // 添加交易記錄
                TransactionRecord record = new TransactionRecord("存款", amount);
                currentUser.addTransaction(record);

                System.out.println("存款成功，新餘額：" + account.getBalance());
                return;
            }
        }
        System.out.println("帳戶 ID 無效！");
    }

    private void withdraw(Scanner scanner) {
        // 檢查用戶是否有任何帳戶
        if (currentUser.getAccounts().isEmpty()) {
            System.out.println("您還沒有任何帳戶，請先開設帳戶再進行提款操作！");
            return;
        }

        System.out.print("請選擇帳戶 ID：");
        String accountId = scanner.next();

        for (Account account : currentUser.getAccounts()) {
            if (account.getAccountId().equals(accountId)) {
                System.out.print("請輸入提款金額：");
                double amount = scanner.nextDouble();
                try {
                    account.withdraw(amount);

                    // 添加交易記錄
                    TransactionRecord record = new TransactionRecord("提款", -amount);
                    currentUser.addTransaction(record);

                    System.out.println("提款成功，新餘額：" + account.getBalance());
                } catch (Exception e) {
                    System.out.println("提款失敗：" + e.getMessage());
                }
                return;
            }
        }
        System.out.println("帳戶 ID 無效！");
    }

    private void viewTransactionHistory() {
        if (currentUser.getAccounts().isEmpty()) {
            printError("您還沒有任何帳戶，請先開設帳戶再查看交易記錄！");
            return;
        }

        if (currentUser.getTransactionHistory().isEmpty()) {
            printInfo("目前沒有任何交易記錄！");
            return;
        }

        System.out.println("\n==================================");
        System.out.println("         交易記錄                ");
        System.out.println("==================================");
        for (TransactionRecord record : currentUser.getTransactionHistory()) {
            System.out.println(record.getDetails());
        }
        System.out.println("==================================");
    }
}
