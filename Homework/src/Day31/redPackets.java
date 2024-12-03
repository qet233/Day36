package Day31;

import java.util.Random;

public class redPackets extends Thread{
    static double money=100;
    static int count=3;
    //最小的中奖金额
    static final double MIN = 0.01;
    double moneyGet=0;
    @Override
    public void run() {
            synchronized (redPackets.class) {
                if(count==0){
                    System.out.println(getName()+"没抢到红包");
                }
                else{
                    count--;
                    if (count!=0) {
                        Random r= new Random();
                        moneyGet = r.nextDouble(money-MIN*count);
                    }else{
                        moneyGet=money;
                    }
                    System.out.println(getName()+"抢到了"+moneyGet+"元");
                    money-=moneyGet;
                }
            }
    }
}
