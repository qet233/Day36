package Day24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test_Map1 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        m.put("陈大财","陈偷懒");
        m.put("王大宝","王忠义");
        m.put("周大福","周到没");
        Set<String> s = m.keySet();
        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = m.get(key);
            System.out.println(key+" "+value);
        }
        System.out.println("=============================");
        for (String key : s) {
            String value = m.get(key);
            System.out.println(key+" "+value);
        }
        System.out.println("=============================");
        s.forEach( s1-> {
                String value = m.get(s1);
                System.out.println(s1+" "+value);
            });
    }
}
