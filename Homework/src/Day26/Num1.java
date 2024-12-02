package Day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Num1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        List<Integer> list1 = list.stream().filter(s -> s % 2 == 0).collect(Collectors.toList ());
        Integer[] arr1 = list.stream().filter(s -> s % 2 == 0).toArray(Integer[]::new);

        System.out.println(Arrays.toString(arr1));
        System.out.println(list1);
    }
}
