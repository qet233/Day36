package Day26;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        List<String> strings = List.of("111", "2220", "33300");
        System.out.println(strings.get(0));
        System.out.println(strings.get(1));
        System.out.println(strings.get(2));
        System.out.println("-------------------------------");
        Iterator<String> it = strings.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-------------------------------");
        for (String s : strings){
            System.out.println(s);
        }
        System.out.println("-------------------------------");
        Set<String> set = Set.of("111", "2220", "33300");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("-------------------------------");
        Iterator<String> it1 = set.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-------------------------------");
        Map<String, String> map = Map.of("cjj", "18", "cyx", "20");
        Set<String> set1 = map.keySet();
        for (String s : set1){
            System.out.println(s+" "+map.get(s));
        }
        System.out.println("-------------------------------");
        Set<Map.Entry<String, String>> set2 = map.entrySet();
        for (Map.Entry<String, String> s : set2) {
            System.out.println(s.getKey()+" "+s.getValue());
        }
    }
}
