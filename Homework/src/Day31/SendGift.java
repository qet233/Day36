package Day31;

public class SendGift implements Runnable{
    int num = 1000;
    @Override
    public void run() {
        while(true){
            synchronized (SendGift.class) {
                String name = Thread.currentThread().getName();
                if(num<10){
                    break;
                }else{
                    num--;
                    System.out.println(name+":还剩"+num+"份礼物");
                }
            }
        }
    }
}
