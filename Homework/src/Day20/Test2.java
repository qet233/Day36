package Day20;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int i = parseInt(sc.nextLine());
            System.out.println(i);
        }
    }
    public static int parseInt(String str){
        String regex="[1-9]\\d{0,9}";
        int number=0;
        if(str.matches(regex)){
            for (int i = 0; i < str.length(); i++) {
                int i1 = str.charAt(i) - '0';
                number = number*10+i1;
            }
        } else {
            System.out.println("数据错误");
        }
        return number;
    }
}
