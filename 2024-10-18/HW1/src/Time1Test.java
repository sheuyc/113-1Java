import java.util.Scanner;

public class Time1Test {
    public static void  main(String[] args){
        //設定起始時間
        Time1 time = new Time1(14, 54, 4);
        //呼叫print Universal()
        System.out.println("24小時制：" + time.printUniversal());
        //呼叫print Standard()
        System.out.println("12小時制：" + time.printStandard());

        //使用者輸入時間過了幾秒，用迴圈呼叫tick
        Scanner input = new Scanner(System.in);

        System.out.println("增加");
        time.tick(input.nextInt());

        //呼叫print Universal()
        System.out.println("24小時制：" + time.printUniversal());
        //呼叫print Standard()
        System.out.println("12小時制：" + time.printStandard());
    }
}
