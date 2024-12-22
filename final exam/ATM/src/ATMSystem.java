import java.util.LinkedList;

public class ATMSystem implements QueueManager {
    private LinkedList<Customer> customerQueue;

    public ATMSystem() {
        customerQueue = new LinkedList<>();
    }

    @Override
    public void addCustomerToQueue(Customer customer) {
        customerQueue.addLast(customer);
    }

    @Override
    public Customer serveNextCustomer() {
        return customerQueue.pollFirst();
    }
}
