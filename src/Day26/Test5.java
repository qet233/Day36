package Day26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list1,"张三丰","张无忌","张翠山","王二麻子","张良","谢广坤");
        Collections.addAll(list2,"张三丰","张三丰","张三丰","张三丰","张无忌","张翠山","王二麻子","张良","谢广坤");

//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("张");
//            }
//        }).forEach(s-> System.out.println(s));
        list1.stream().filter(s->s.startsWith("张")).forEach(s-> System.out.println(s));
        System.out.println("=======================");
        list1.stream().limit(3).forEach(d-> System.out.println(d));
        System.out.println("=======================");
        list1.stream().skip(3).forEach(d-> System.out.println(d));
        System.out.println("=======================");
        list2.stream().distinct().forEach(s-> System.out.println(s));
        System.out.println("=======================");
        Stream.concat(list1.stream(),list2.stream()).forEach(s-> System.out.println(s));
        System.out.println("=======================");

    }
}
