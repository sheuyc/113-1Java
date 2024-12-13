import java.util.ArrayList;

public class ArrayListDemo {
    public static void main (String[] args) {
        //建立一個Arraylist
        ArrayList<String> list = new ArrayList<>();

        //新增元素
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("ArrayList內容：" + list);

        String fruit = list.get(1);
        System.out.println("第2個元素是：" + fruit);
    }
}
