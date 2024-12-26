import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransactionRecord implements Serializable {
    private static final long serialVersionUID = 1L;
    private String description; // 交易類型（存款/提款等）
    private double amount;      // 金額
    private Date date;          // 交易日期

    public TransactionRecord(String description, double amount) {
        this.description = description;
        this.amount = amount;
        this.date = new Date();
    }

    public String getDetails() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String formattedDate = formatter.format(date);
        String amountString = String.format("%.2f", amount); // 格式化金額為小數點後兩位
        return "日期: " + formattedDate + ", 類型: " + description + ", 金額: " + amountString + " 元";
    }
}
