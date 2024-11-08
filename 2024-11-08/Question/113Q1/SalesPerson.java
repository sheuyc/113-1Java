public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    public SalesPerson(String id, String name) {
        //呼叫下一個的建構子
    }

    public SalesPerson(String id, String name, double grossSales, double commissionRate) {
        // grossSales & commissionRate的設定須呼叫set方法

    }

    public String getId() {
        
    }

    public String getName() {
        
    }

    public void setGrossSales(double grossSales) {
        //檢查銷售金額必須為正值!
    }

    public void setCommissionRate(double commissionRate) {
        //檢查獎金比例必須為0~1!
    }

    public double salary() {
        //薪資為銷售額乘上分紅比
    }

    public String toString() {
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.2f%n薪資：%.1f%n",
                this.id, this.name, this.grossSales, this.commissionRate, salary() );
    }
}
