//package cc.openhome;

class Clothes2 {
    String color;
    char size;
    
    Clothes2(String color, char size) {//Constructor 建構子，用於設定初始值
        this.color = color;
        this.size = size;
    }
    void  changeColor(String color){
        this.color = color;
    }
}

public class Field2 {
    public static void main(String[] args) {
        //var sun = new Clothes2("red", 'S');
        //var spring = new Clothes2("green", 'M');
        Clothes2 sun = new Clothes2("red", 'S');
        Clothes2 spring = new Clothes2("green", 'M');

        spring.changeColor("yellow");

        System.out.printf("sun (%s, %c)%n", sun.color, sun.size);
        System.out.printf("spring (%s, %c)%n", spring.color, spring.size);
    }
}