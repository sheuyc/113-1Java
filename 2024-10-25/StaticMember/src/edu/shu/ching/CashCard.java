package  edu.shu.ching;

public class CashCard {
    private String number;
    private int balance;
    private int bonus;
    private  final int BOUNSCASH = 10;
    private static int cardOrder;
    //private String number = "A000";
    //方法的身分辨識 = 方法名稱 + 參數個數 + 參數型態
    public CashCard() {
        setNumber("unknown");
    }

    public CashCard(String number) {
        setNumber(number);
        System.out.printf("第 %d 張卡%n", ++this.cardOrder);
    }

    public CashCard(String number, int balance) {
        setNumber(number);
        setBalance(balance);
        System.out.printf("第 %d 張卡%n", ++this.cardOrder);
    }
    
    public CashCard(String number, int balance, int bonus) {
        //this.number = number;
        //this.balance = balance;
        //this.bonus = bonus;
        setNumber(number);
        setBalance(balance);
        setBonus(bonus);
        System.out.printf("第 %d 張卡%n", ++this.cardOrder);
    }

    public String getNumber() {
        return this.number;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getBonus() {
        return this.bonus;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(int balance) {
        if (balance >= 0){
            this.balance = balance;
        }
        else {
            System.out.println("格式不符，保持原值");
        }
    }

    public void setBonus(int bonus) {
        if (balance >= 0){
            this.bonus = bonus;
        }
        else {
            System.out.println("格式不符，保持原值");
        }
    }
    //儲值
    public void store(int money) {
//        if (money > 0) {
//            this.balance += money;
//            if (money >= 1000) {
//                this.balance += money/1000;
//            }
//        }
//        else {
//            System.out.println("儲值金額為負，來亂的！");
//        }
        topUp(money);
    }
    //辨識卡號
    public void store(String number, int money) {
        if (this.number.equals(number)) {
            topUp(money);
        }
        else {
            System.out.println("卡號不符");
        }
    }
    //方法儲值
    private void topUp (int money) {
        if (money > 0) {
            this.balance += money;
            if (money >= 1000) {
                this.bonus += money / 1000;
            }
        }
        else {
            System.out.println("儲值金額為負，來亂的！");
        }
    }
    //扣款
    public void charge(String number, int money){
        if(this.number.equals(number)){
            deduction(money);
        }
        else {
            System.out.println("卡號不符");
        }
    }
    //扣款+兌換紅利
    public void charge(String number, int money, int bonus){
        if(this.number.equals(number)){
            exchange(bonus);
            deduction(money);
        }
        else {
            System.out.println("卡號不符");
        }
    }
    //方法扣款
    private void deduction(int money){
        if (money > 0){
            if (money <= this.balance){
                this.balance -= money;
            }
            else {
                System.out.println("餘額不足，可憐啊！");
            }
        }
        else {
            System.out.println("扣儲金額為負，來亂的！");
        }
    }
    //紅利
    public int exchange(int bonus) {
        if (bonus > 0 && this.bonus >= bonus) {
            this.bonus -= bonus;
            setBalance(this.balance + bonus * BOUNSCASH);
        }
        else {
            System.out.println("點數不足");
        }
        return this.bonus;
    }
}
