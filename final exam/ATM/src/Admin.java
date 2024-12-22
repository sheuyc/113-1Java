public class Admin extends User {
    public Admin(String userId, String name, String password) {
        super(userId, name, password);
    }

    public void manageSystem() {
        System.out.println("管理員正在管理系統...");
    }
}