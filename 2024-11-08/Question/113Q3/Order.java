public class Order {
    private String itemName;
    private double itemPrice;
    private int amount;

    public Order(String itemName, double itemPrice, int amount) {
        this.itemName =itemName;
        this.itemPrice = itemPrice;
        this.amount = amount;
    }

    public double totalSale() {
        return itemPrice * amount;
    }

    public String toString() {
        return String.format("產品名稱：%6s 單價：%7.1f 數量：%3d%n", itemName, itemPrice, amount);
    }
}
