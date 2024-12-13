import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MutiException {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        try {
            File file = new File("nonexistentfile.txt");
            FileReader reader = new FileReader(file);
            System.out.println(number[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("處理未減例外：" + e.getMessage());
        }
        catch (FileNotFoundException e) {
            System.out.println("處理受減例外：" + e.getMessage());
        }
//        catch (Exception e) {
//            System.out.println("處理受減例外：" + e.getMessage());
//        }
    }
}
