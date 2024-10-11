public class IntegerDemo2 {
    public static void main(String[] args) {
        int data1 = 100;
        Integer wrapper1 = data1; //自動裝箱
        Integer wrapper2 = 100;
        int data2 = wrapper2; //自動拆箱
        
        if (wrapper1 == wrapper2) {
            System.err.println("wrapper1 == wrapper2");
        } else {
            System.err.println("wrapper1 != wrapper2");
        }
    }
}
