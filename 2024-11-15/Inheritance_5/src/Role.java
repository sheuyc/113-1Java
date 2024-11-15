 public class Role {
    private String name;
    private int level;
    private int blood;

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public void fight() {
        System.out.print("發動攻擊：");
     }

     @Override
     public String toString() {
        return String.format("(%s, %d, %d)", name, level, blood);
     }
}