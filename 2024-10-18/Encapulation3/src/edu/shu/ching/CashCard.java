package  edu.shu.ching;

public class CashCard {
    //String number;
    //int balance;
    //int bonus;
    private String number;
    private int balance;
    private int bonus;

    public CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    public String getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public int getBonus() {
        return bonus;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
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
