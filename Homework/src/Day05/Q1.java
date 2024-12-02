package Day05;
import java.util.Random;
public class Q1 {
//1.导包
        public static void main(String[] args) {
            //2.创建对象
            Random r = new Random();
            //3.生成随机数
            int number = r.nextInt(100);//包左不包右，包头不包尾
            //0 ~ 99
            System.out.println(number);

        }
}
