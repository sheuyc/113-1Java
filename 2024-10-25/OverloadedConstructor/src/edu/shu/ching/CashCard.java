package  edu.shu.ching;

public class CashCard {
    private String number;
    private int balance;
    private int bonus;
    //private String number = "A000";

    public CashCard() {
        setNumber("unknown");
    }

    public CashCard(String number) {
        setNumber(number);
    }

    public CashCard(String number, int balance) {
        setNumber(number);
        setBalance(balance);
    }

    public CashCard(String number, int balance, int bonus) {
        //this.number = number;
        //this.balance = balance;
        //this.bonus = bonus;
        setNumber(number);
        setBalance(balance);
        setBonus(bonus);
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
        if (money > 0) {
            this.balance += money;
            if (money >= 1000) {
                this.balance += money/1000;
            }
        }
        else {
            System.out.println("儲值金額為負，來亂的！");
        }
    }
    //扣款
    public void charge(int money){
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
        if (bonus > 0) {
            this.bonus -= bonus;
        }
        return this.bonus;
    }
}
