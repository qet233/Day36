package Day06;
import java.util.Random;
public class Q11 {
    public static void main(String[] args) {
        int[] money={2,588,888,1000,10000};
        Random r = new Random();

        int b =0;
        while(b<5 ){
            int a = r.nextInt(5);
            if (money[a]==0){
                continue;
            } else {
                System.out.println(money[a]+"元奖金被抽出");
                b++;
                money[a]=0;
            }
        }
    }
}
