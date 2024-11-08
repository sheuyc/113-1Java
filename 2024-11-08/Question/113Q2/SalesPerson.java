public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    public SalesPerson(String id, String name) {
        //需修改
    }

    public String getId() {
        
    }

    public String getName() {
        
    }

    public void setGrossSales(double grossSales) {
       
    }

    public void setCommissionRate(double commissionRate) {
        
    }

    public double salary() {
        
    }

    public String toString() {
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.1f%n薪資：%.1f%n",
                this.id, this.name, this.grossSales, this.commissionRate, salary() );
    }
}
