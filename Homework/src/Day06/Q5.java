package Day06;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(getNum(num));
    }
    public static int getNum(int num){
        int a =1;
        int sum = 0 ;
        while (num>0){
            a = num % 10;
            //System.out.println(a);
            num = num/10;
            sum++;
        }
        return sum;
    }
}
