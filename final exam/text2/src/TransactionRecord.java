import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TransactionRecord 類別，表示一筆交易記錄。
 * 包括交易的描述（如存款或提款）、金額和交易日期。
 * 支援序列化，便於存儲和傳輸交易數據。
 */
public class TransactionRecord implements Serializable {
    // 序列化版本 ID，用於版本控制
    private static final long serialVersionUID = 1L;

    private String description; // 交易類型描述（如存款或提款）
    private double amount;      // 交易金額
    private Date date;          // 交易日期

    /**
     * 建構子，用於創建一筆交易記錄。
     *
     * @param description 交易類型描述
     * @param amount      交易金額
     */
    public TransactionRecord(String description, double amount) {
        this.description = description; // 設定交易描述
        this.amount = amount;           // 設定交易金額
        this.date = new Date();         // 設定交易日期為當前時間
    }

    /**
     * 獲取交易的詳細信息，包括日期、類型和金額。
     *
     * @return 格式化後的交易詳細信息字串
     */
    public String getDetails() {
        // 使用 SimpleDateFormat 格式化日期
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String formattedDate = formatter.format(date);

        // 格式化金額為小數點後兩位
        String amountString = String.format("%.2f", amount);

        // 返回格式化後的交易詳細信息
        return "日期: " + formattedDate + ", 類型: " + description + ", 金額: " + amountString + " 元";
    }
}
