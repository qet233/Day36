package Day24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test_Map2 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        m.put("陈大财","陈偷懒");
        m.put("王大宝","王忠义");
        m.put("周大福","周到没");
        Set<Map.Entry<String, String>> entries = m.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
        }
        System.out.println("============================");
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key+" "+value);
        }
        System.out.println("============================");
        entries.forEach(s1->{
            String key = s1.getKey();
            String value = s1.getValue();
            System.out.println(key+" "+value);
        });
    }
}
