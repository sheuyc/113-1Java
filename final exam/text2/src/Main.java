/**
 * 主類別 Main，負責啟動整個 ATM 銀行系統。
 */
public class Main {
    /**
     * 主方法，程式的入口點。
     *
     * @param args 命令列參數（目前未使用）
     */
    public static void main(String[] args) {
        // 創建 ATM 系統的實例
        ATMSystem atmSystem = new ATMSystem();

        // 啟動 ATM 系統
        atmSystem.run();
    }
}
