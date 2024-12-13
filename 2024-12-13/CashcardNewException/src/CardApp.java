import java.util.Scanner;

public class CardApp {
    public static void main(String[] args) {
        CashCard[] cards = {
                new CashCard("A001", 500, 0),
                new CashCard("A002", 300, 0),
                new CashCard("A003", 1000, 1),
                new CashCard("A004")
                //new CashCard("A004", 2000, 2),
                //new CashCard("A005", 3000, 3)
        };

        Scanner input = new Scanner(System.in);

//        for(CashCard card : cards) {
//            System.out.printf("為(%s, %d, %d)儲值",
//                    card.getNumber(), card.getBalance(), card.getBonus());
//
//            card.store(input.nextInt());
//            //card.balance += input.nextInt();
//
//            System.out.printf("明細(%s, %d, %d)%n",
//                    card.getNumber(), card.getBalance(), card.getBonus());
//        }

        for (int i = 0; i < cards.length; i++) {
            System.out.printf("為(%s, %d, %d)儲值", cards[i].getNumber(), cards[i].getBalance(), cards[i].getBonus());
            if (i % 2 == 0) {

                cards[i].store(input.nextInt());

            }
            else {
                cards[i].store(input.next(), input.nextInt());
            }
            System.out.printf("明細(%s, %d, %d)%n",cards[i].getNumber(), cards[i].getBalance(), cards[i].getBonus());
        }

        cards[1].charge("A002", 500);
        System.out.printf("明細(%s, %d, %d)%n",cards[1].getNumber(), cards[1].getBalance(), cards[1].getBonus());
        cards[1].charge("A002", 100, 1);
        System.out.printf("明細(%s, %d, %d)%n",cards[1].getNumber(), cards[1].getBalance(), cards[1].getBonus());
    }
}