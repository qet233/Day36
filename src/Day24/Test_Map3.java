package Day24;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test_Map3 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        m.put("陈大财","陈偷懒");
        m.put("王大宝","王忠义");
        m.put("周大福","周到没");
        m.forEach((s,s2)->System.out.println(s+" "+s2));
        System.out.println(m);
    }
}
