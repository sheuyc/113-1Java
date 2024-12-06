public class Ocean {
    public static void main(String[] args) {
        doSwim(new Anemonefish("尼莫"));
        doSwim(new Shark("蘭尼"));
        doSwim(new SwimPlayer("賈斯汀"));
        doSwim(new Submarine("黃色一號"));
        doSwim(new Seaplane("空軍零號"));
        doSwim(new FlyingFish("甚平"));
        doFly(new Helicopter("阿帕契"));
    }

    static void doSwim(Swimmer swimmer) {
        swimmer.swim();
        if (swimmer instanceof Diver) {
           ((Diver) swimmer).dive();
        }
        if (swimmer instanceof Flyer) {
            ((Flyer) swimmer).fly();
        }
    }

    static void doFly(Flyer flyer) {
        flyer.fly();
    }
}