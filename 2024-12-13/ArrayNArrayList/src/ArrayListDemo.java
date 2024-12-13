import java.util.ArrayList;

public class ArrayListDemo {
    public static void main (String[] args) {
        //建立一個Arraylist
        ArrayList<String> list = new ArrayList<>();

        //新增元素
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        //顯示所有元素
        System.out.println("ArrayList內容：" + list);

        //取得特定索引元素
        String fruit = list.get(1);
        System.out.println("第2個元素是：" + fruit);

        //修訂特定索引元素
        list.set(1,"Blueberry");
        System.out.println("更新後的ArrayList：" + list);

        //刪除元素
        list.remove(0);
        System.out.println("刪除後的ArrayList：" + list);

        //檢查大小
        int size = list.size();
        System.out.println("ArrayList大小：" + size);

        //判斷是剖包含定元素
        boolean containsCherry = list.contains("Cherry");
        System.out.println("ArrayList是否包含'Cherry'？" + containsCherry);

        //使用迴圈訪問所有元素
        if (!list.isEmpty()) {
            System.out.println("適用迴圈訪問元素：");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
        else {
            System.out.println("ArrayList是空的：");
        }
    }
}
