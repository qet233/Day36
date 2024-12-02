package Day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Num5 {
    public static void main(String[] args) {
        ArrayList<Actor > list = new ArrayList<>();
        Actor a1 = new Actor("zs",18);
        Actor a2 = new Actor("ls",24);
        Actor a3 = new Actor("ww",21);
        Collections.addAll(list,a1,a2,a3);
        String[] arr = list.stream().map(Actor::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
