package Day20;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        while (sum<=200){
//            int a = Integer.parseInt(sc.nextLine());
//            if (a < 1 || a > 100){
//                System.out.println("当前数字不在1~100的范围当中，请重新输入");
//                continue;
//            }
            int a =r.nextInt(1,101);
            list.add(a);
            sum+=a;
        }
        for (int i =0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}
