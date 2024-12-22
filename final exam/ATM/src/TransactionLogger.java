import java.util.ArrayList;

public interface TransactionLogger {
    void logTransaction(String message);  // 記錄交易
    ArrayList<String> getTransactionLog();  // 獲取交易記錄
}
