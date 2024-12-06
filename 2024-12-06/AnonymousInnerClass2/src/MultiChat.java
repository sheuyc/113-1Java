public class MultiChat {
    public static void main(String[] args) {
        var c1 = new Client("127.0.0.1", "Caterpillar");
        var c2 = new Client("192.168.0.2", "Justin");
        var c3 = new Client("112.88.99.5", "Dolly");

        var queue = new ClientQueue();

//        queue.addClientListener(new ClientListener() {
//            @Override
//            public void clientAdded(ClientEvent event) {
//                System.out.printf("%s 從 %s 連線%n",
//                        event.getName(), event.getIp());
//            }
//
//            @Override
//            public void clientRemoved(ClientEvent event) {
//                System.out.printf("%s 從 %s 離線%n",
//                        event.getName(), event.getIp());
//            }
//        });
        
        queue.enqueue(c1);
        queue.enqueue(c2);
        queue.enqueue(c3);

        queue.pay(c1);
        queue.pay(c3);

        queue.dequeue(c1);
        queue.dequeue(c2);
    }
}