package Day10;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        if(sb.toString().equals(str)){
            System.out.println("是");
        } else{
            System.out.println("否");
        }
    }
}
