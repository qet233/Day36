package Day25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test_4 {
    public static void main(String[] args) {
        ArrayList<String> list1= new ArrayList<>();
        ArrayList<String> list2= new ArrayList<>();
        Collections.addAll(list1,"aaa","bbb","ccc","ddd","eee","fff");
//        Random r= new Random();
//        for (int i = 0; i < 6; i++) {
//            int rI = r.nextInt(list1.size());
//            String name = list1.remove(rI);
//            list2.add(name);
//            System.out.println(name);
//        }
        long countTime=0;
        for (int n =0;n<10;n++) {
            long start = System.currentTimeMillis();
            for (int i = 1; i <= 10; i++) {
                System.out.println("=========第" + i + "轮点名开始了======================");
                //3.获取集合的长度
                int count = list1.size();
                //4.随机点名
                Random r = new Random();
                //内循环：每一轮中随机循环抽取的过程
                for (int j = 0; j < count; j++) {
                    int index = r.nextInt(list1.size());
                    String name = list1.remove(index);
                    list2.add(name);
                    System.out.println(name);
                }
                //此时表示一轮点名结束
                //list1 空了 list2 10个学生的名字
                list1.addAll(list2);
                list2.clear();
            }
            long end = System.currentTimeMillis();
            countTime+=(end-start);
            System.out.println(end-start);
        }
        System.out.println(countTime);


    }
}
