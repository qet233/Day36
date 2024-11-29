package Day23;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ListUtil.addAll(list,5,5);
        System.out.println(list);
        ListUtil.addAll(list,15,17,89,189,14,95);
        System.out.println(list);

    }
}
