package Day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Num3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list1,"张三,24","李四,24","王五一,18","饥荒,54","那一天,45");
        Collections.addAll(list2,"杨催化,24","李翠花,24","王五,98","杨树,66","陈家河,12");
        String[] arr1 = list1.stream().filter(s -> (s.split(",")[0]).length() == 3)
                .limit(2)
                .toArray(String[]::new);
        String[] arr2 = list2.stream().filter(s -> (s.split(",")[0]).startsWith("杨"))
                .skip(1)
                .toArray(String[]::new);
        String[] arr3 =new String[arr1.length+arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        System.out.println(Arrays.toString(arr3));
        List<Actor> list3 = Arrays.stream(arr3).map(Actor::new).collect(Collectors.toList());
        System.out.println(list3);
    }
}
