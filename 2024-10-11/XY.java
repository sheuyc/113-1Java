//package cc.openhome;

public class XY {
    public static void main(String[] args) {
        int[][] cords = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for(int x = 0; x < cords.length; x++) {             //巡行二維陣列，x為列數
            for(int y = 0; y < cords[x].length; y++) {      //巡行二維陣列，y為行數，cord[x]為第x列的陣列
                System.out.printf("%2d", cords[x][y]);
            }
            System.out.println();
        }
    }
} 
