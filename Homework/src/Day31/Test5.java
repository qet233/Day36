package Day31;

import java.util.ArrayList;
import java.util.Collections;

public class Test5 {
    public static void main(String[] args) {
        Integer[] arr ={10,5,20,50,100,200,500,800,2,80,300,700};
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,arr);
        DrawBox db1= new DrawBox(list);
        DrawBox db2= new DrawBox(list);
        db1.setName("抽奖箱1");
        db2.setName("抽奖箱2");
        db1.start();
        db2.start();
    }
}
