public interface Transaction {
    void execute(); // 執行交易
    String getDetails(); // 返回交易細節
}