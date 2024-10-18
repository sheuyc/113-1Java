class CashCard {
    String number;
    int balance;
    int bonus;

    CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }
    //儲值
    void store(int money) {
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
    void charge(int money){
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
    int exchange(int bonus) {
        if (bonus > 0) {
            this.bonus -= bonus;
        }
        return this.bonus;
    }
}
