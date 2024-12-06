public class Submarine extends Boat implements Diver {
    public Submarine(String name) {
        super(name);
    }
    
    @Override
    public void swim() {
        System.out.print("潛水艇");
        super.swim();
    }
    @Override
    public void dive() {
        System.out.printf("潛水艇 %s 潛行%n", name);
    }
}      