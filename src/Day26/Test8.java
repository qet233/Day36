package Day26;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张三丰-200-男","张三丰-200-男","张无忌-18-男","张翠山-40-女","王二麻子-24-女","张良-35-男","谢广坤-36-男");
        List<String> list = list1.stream().filter(s -> "男".equals(s.split("-")[2]))
                .collect(Collectors.toList());
        System.out.println(list);

        Set<String> set = list1.stream().filter(s -> "男".equals(s.split("-")[2]))
                .collect(Collectors.toSet());
        System.out.println(set);

//        Map<String, Integer> m = list1.stream().distinct()
//                .filter(s -> "男".equals(s.split("-")[2]))
//                .collect(Collectors.toMap(new Function<String, String>() {
//                    @Override
//                    public String apply(String s) {
//                        return s.split("-")[0];
//                    }
//                }, new Function<String, Integer>() {
//                    @Override
//                    public Integer apply(String s) {
//                        return Integer.parseInt(s.split("-")[1]);
//                    }
//                }));
        Map<String, Integer> m = list1.stream().distinct()
                .filter(s -> "男".equals(s.split("-")[2]))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[1])));
        Set<Map.Entry<String, Integer>> set1 = m.entrySet();
        for (Map.Entry<String, Integer> entry : set1) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
