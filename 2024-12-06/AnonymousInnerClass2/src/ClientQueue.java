import java.util.ArrayList;

public class ClientQueue {
    private ArrayList clients = new ArrayList();
    //private ArrayList listeners = new ArrayList();
    private ClientListener listener  = new ClientListener() {
        @Override
        public void clientAdded(ClientEvent event) {
            System.out.println("Client added: " + event.getName());
        }

        @Override
        public void clientRemoved(ClientEvent event) {
            System.out.println("Client removed: " + event.getName());
        }
    };
            
//    public void addClientListener(ClientListener listener) {
//        listeners.add(listener);
//    }
    
    public void enqueue(Client client) {
        clients.add(client);
        ClientEvent event = new ClientEvent(client);
        listener.clientAdded(event);
//        for(var i = 0; i < listeners.size(); i++) {
//            var listener = (ClientListener) listeners.get(i);
//            listener.clientAdded(event);
//        }
    }
    
    public void remove(Client client) {
        clients.remove(client);
        var event = new ClientEvent(client);
//        for(var i = 0; i < listeners.size(); i++) {
//            var listener = (ClientListener) listeners.get(i);
//            listener.clientRemoved(event);
//        }
    }
}