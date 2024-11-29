package Day10;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        String rightUsername="Qet233";
        String rightPassword="692004";

        for (int i =0;i<3;i++) {
            Scanner sc = new Scanner(System.in);
            String username=sc.next();
            String password=sc.next();
            if(username.equals(rightUsername)&&password.equals(rightPassword)){
                System.out.println("cg");
                break;
            } else {
                if(i<2){
                    System.out.println("错误还剩"+(2-i)+"次机会");
                } else {
                    System.out.println("XXX!!!");
                }
            }
        }
    }

}
