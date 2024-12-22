public interface QueueManager {
    void addCustomerToQueue(Customer customer);  // 加入隊列
    Customer serveNextCustomer();  // 處理下一位客戶
}