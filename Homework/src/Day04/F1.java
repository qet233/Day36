package Day04;

import java.util.Scanner;

public class F1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int a=0;
        if (number1>number2) {
            a=number1;
            number1 = number2;
            number2 = a;
        }
        for (int i = number1;i<=number2;i++){
            System.out.println(i);

        }
    }

}
