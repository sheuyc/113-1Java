public class UncheckedException {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        try {
            System.out.println(number[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("處裡未減例外：" + e.getMessage());
        }
    }
}
