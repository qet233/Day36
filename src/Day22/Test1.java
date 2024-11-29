package Day22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        //javabean一定要重写equals方法
        System.out.println(coll.contains("aaa"));

        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("====================");
        for (String s : coll) {
            System.out.println(s);
        }
        System.out.println("====================");
        coll.forEach( s -> System.out.println(s));
    }
}
