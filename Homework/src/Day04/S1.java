package Day04;

import java.util.Scanner;

public class S1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        switch (c){
            case 1:
                System.out.println(a+b);
                break;
            case 2 :
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;


        }
    }
}
