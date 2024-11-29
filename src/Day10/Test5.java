package Day10;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.next();
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        String rts="";
        for(int i = 0;i<str.length();i++){
            rts=str.charAt(i)+rts;
        }
        return rts;
    }
}
