package Day20;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int c = 4;
        System.out.println(toBinaryString(a));
        System.out.println(toBinaryString(b));
        System.out.println(toBinaryString(c));

    }
    public static String toBinaryString(int i){
        StringBuilder sb = new StringBuilder();
        while (i>0) {
            int m = i % 2;
            i = i / 2;
            sb.insert(0,m);
        }
        return sb.toString();
    }
}
