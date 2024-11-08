import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.ArrayList;

public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    private Order[] orderArray = new Order[3];
    private int orderCount = 0;

    public SalesPerson(String id, String name) {
        //預設commissionRate = 0.01
    }

    public SalesPerson(String id, String name, double commissionRate) {
        
    }

    public String getId() {
        
    }

    public String getName() {
       
    }

    public void setCommissionRate(double commissionRate) {
        
    }

    public void setOrderArray(String itemName, double itemPrice, int amount) {
        //*************************
        //(加分項)若陣列長度不足，將陣列長度x2
        //(必要)新增order到orderList
        //*************************
    }

    public double getGrossSales() {
        //*************************
        //計算總銷售額，並回傳
        //*************************
    }

    
    public String getOrders() {
        
        //****************************************
        //將所有oder的內容，整合為一個字串，並回傳
        //****************************************
    }

    }
    
    public double salary() {
       //****************************************
        //利用getGrossSales()計算薪資
        //****************************************     
    }

    public String toString() {
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.2f%n薪資：%.1f%n",
                this.id, this.name, this.grossSales, this.commissionRate, salary() );
    }
}
