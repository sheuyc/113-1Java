import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MutiException {
    int[] number = {1, 2, 3};
    try {
        File file = new File("nonexistentfile.txt");
        FileReader reader = new FileReader(file);
        System.out.println(number[5]);
    }
    catch (FileNotFoundException e) {
        System.out.println("處裡未減例外：" + e.getMessage());
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("處裡未減例外：" + e.getMessage());
    }

}
