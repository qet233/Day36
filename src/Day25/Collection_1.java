package Day25;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Collection_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(10);
        list.add(50);
        list.add(150);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, (o1,o2) ->o2-o1);
        System.out.println(list);
    }
}
