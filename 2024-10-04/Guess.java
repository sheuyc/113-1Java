//package cc.openhome;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        var number = (int) (Math.random() * 10);
        var guess = -1;
        
        do {
            System.out.print("�q�Ʀr�]0 ~ 9�^:");
            guess = console.nextInt();
        } while(guess != number);
        
        System.out.println("�q���F...XD");
    }
}
