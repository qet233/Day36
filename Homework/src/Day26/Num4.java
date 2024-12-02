package Day26;

import Day09.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Num4 {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        Collections.addAll(list,"张三,24","李四,24","王五一,18");
        Actor[] arr = list.stream().map(Actor::new).toArray(Actor[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
