package Day10;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int bigCount=0;
        int smallCount=0;
        int numCount=0;
        for(int i=0;i<str.length();i++){
            if('a'<=str.charAt(i)&& str.charAt(i)<='z'){
                smallCount++;
            } else if('A'<=str.charAt(i)&& str.charAt(i)<='Z') {
                bigCount++;
            } else if('0'<=str.charAt(i)&& str.charAt(i)<='9'){
                numCount++;
            }
        }
        System.out.println("大写"+bigCount+" 小写"+smallCount+" 数字"+numCount);
    }
}
