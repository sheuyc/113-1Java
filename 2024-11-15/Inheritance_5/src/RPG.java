public class RPG {
    public static void main(String[] args) {
        demoSwordsMan();
        demoMagician();
    }

    static void demoSwordsMan() {
        var swordsMan = new SwordsMan();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);
        //System.out.printf("劍士：(%s, %d, %d)%n", swordsMan.getName(),
        //        swordsMan.getLevel(), swordsMan.getBlood());
        System.out.println(swordsMan);
        //swordsMan.fight();
        drawFight(swordsMan);
    }

    static void demoMagician() {
        var magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);
        //System.out.printf("魔法師：(%s, %d, %d)%n", magician.getName(),
        //        magician.getLevel(), magician.getBlood());
        System.out.println(magician);
        //magician.fight();
        //magician.cure();
        drawFight(magician);
    }

    static void drawFight(Role role) {
        if (role instanceof SwordsMan) {
            System.out.println(role.getName());
            role.fight();
        }
        else if (role instanceof Magician) {
            System.out.println(role.getName());
            role.fight();
        }
        else {
            System.out.println("此角色不具備戰鬥能力");
        }
    }

    //static void drawName() {}
}