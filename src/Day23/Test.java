package Day23;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(80);
        ts.add(40);
        ts.add(59);
        System.out.println(ts);
        System.out.println("===========================");
        Iterator<Integer> it =ts.iterator();
        while (it.hasNext()){
            int i = it.next();
            System.out.println(i);
        }
        System.out.println("===========================");
        for(int i : ts){
            System.out.println(i);
        }
        System.out.println("===========================");
        ts.forEach(integer-> System.out.println(integer));
        System.out.println("===========================");
        Students s1 = new Students(20,"zhangsan");
        Students s2 = new Students(20,"lisi");
        Students s3 = new Students(21,"wangwu");
        TreeSet<Students> ts1 = new TreeSet<>();
        ts1.add(s1);
        ts1.add(s2);
        ts1.add(s3);
        System.out.println(ts1);
        System.out.println("===========================");
        TreeSet<String> ts2= new TreeSet<>((o1,o2)-> {
                int i = o1.length()-o2.length();
                i=i==0?o1.compareTo(o2):i;
                return i;
            });
        ts2.add("asd");
        ts2.add("jd");
        ts2.add("hgrhr");
        ts2.add("fdsf");
        System.out.println(ts2);
        System.out.println("===========================");
    }
}
