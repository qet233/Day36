package Day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三丰","张无忌","张翠山","王二麻子","张良","谢广坤");
        list.stream().forEach(s-> System.out.println(s));
        long count = list.stream().count();
        System.out.println(count);

        Object[] arr = list.stream().toArray();
        System.out.println(Arrays.toString(arr));

//        String[] arr1 = list.stream().toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });
        String[] arr1 = list.stream().toArray(s -> new String[s]);
        System.out.println(Arrays.toString(arr1));
    }
}
