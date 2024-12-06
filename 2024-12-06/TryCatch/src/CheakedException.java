import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class CheakedException {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistentfile.txt");
            FileReader reader = new FileReader(file);
        }
        catch (FileNotFoundException e) {
            System.out.println("處裡未減例外：" + e.getMessage());
        }


    }
}
