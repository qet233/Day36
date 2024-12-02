package Day26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Num2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String str1="zhangsan,23";
        String str2="lisi,24";
        String str3="wangwu,25";
        Collections.addAll(list,str1,str2,str3);
        Map<String, Integer> map = list.stream().filter(s -> (Integer.parseInt(s.split(",")[1])) >= 24)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        System.out.println(map);
    }
}
