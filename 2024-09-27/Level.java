
import java.util.Scanner;

//package cc.openhome;

public class Level {
    public static void main(String[] args) {
        //var score = 88;
        //var level = '\0'; 
        int score;
        char level = '\0'; 
        
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入分數：");
        score = input.nextInt();

        if(score >= 90) {
            level = 'A';
        } 
        else if(score >= 80) {
            level = 'B';
        }
        else if(score >= 70) {
            level = 'C';
        }
        else if(score >= 60) {
            level = 'D';
        }        
        else {
            level = 'F';
        }
        System.out.printf("得分等級:%c%n", level);
    }
}
