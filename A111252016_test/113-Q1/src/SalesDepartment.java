public class SalesDepartment {
    public  static void main(String args[]) {
        SalesPerson sales1 = new SalesPerson("SE111", "王建銘", 2000000, 0.01);
        SalesPerson sales2 = new SalesPerson("SE222", "李國強", 2000000, 0.03);
        SalesPerson sales3 = new SalesPerson("SE333", "陳志明", 2000000, 0.02);
        SalesPerson sales4 = new SalesPerson("SE444", "李德輔");

        System.out.printf("%s%n%s%n%s%n%s%n", sales1.toString(), sales2.toString(), sales3.toString(), sales4);
    }
}
