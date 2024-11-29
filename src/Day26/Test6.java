package Day26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张三丰-200","张无忌-18","张翠山-40","王二麻子-24","张良-35","谢广坤-36");
//        list1.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                String[] arr = s.split("-");
//                String ageString=arr[1];
//                int age=Integer.parseInt(ageString);
//                return age;
//            }
//        }).forEach(s-> System.out.println(s));
        list1.stream().map(s->Integer.parseInt(s.split("-")[1]))
                .forEach(s-> System.out.println(s));

    }
}
