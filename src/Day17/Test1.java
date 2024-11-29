package Day17;

import java.io.IOException;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        int[] a = {1,2,3,4,5};
        int[] b = new int[5];
        String c = "你好";
        String d = "你好";
        System.out.println(Math.PI);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        System.arraycopy(a,0,b,0,a.length);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println(c.equals(d));
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
//        System.out.println(Runtime.getRuntime().exec("shutdown -s -t 3600"));
        System.out.println(Runtime.getRuntime().exec("shutdown -a"));
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
        Runtime.getRuntime().exit(0);
    }
}
