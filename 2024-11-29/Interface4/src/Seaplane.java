public class Seaplane extends Airplane implements Swimmer {
    public Seaplane(String name) {
        super(name);
    }
    
    @Override
    public void fly() {
        System.out.print("水上飛機");
        super.fly();
        //System.out.printf("水上飛機 %s 在飛%n", getName());
    }

    @Override
    public void swim() {
        System.out.printf("水上飛機 %s 航行海面%n", getName());
    }
}
