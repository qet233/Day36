package Day22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add(1,"qqq");
        System.out.println(list);
        System.out.println("======================");
        System.out.println(list.remove(0));
        System.out.println(list);
        System.out.println("======================");
        System.out.println(list.set(0,"QQQ"));
        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println("======================");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("======================");
        for(String s :list){
            System.out.println(s);
        }
        System.out.println("======================");
        list.forEach(s-> System.out.println(s));
        System.out.println("======================");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("======================");
        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            String s = lit.next();
            if(s.equals("QQQ")){
                lit.add("qqq");
            }
            System.out.println(s);
        }
    }
}
