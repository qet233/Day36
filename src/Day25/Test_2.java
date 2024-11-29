package Day25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd","eee","fff");
        //随机抽五次
        for (int i =0;i<5;i++) {
            Collections.shuffle(list);
            System.out.println(list.get(0));
        }
        //第二种方法
        Random r = new Random();
        int i = r.nextInt(list.size());
        System.out.println(list.get(i));
    }
}
