package Day31;

public class Test2 {
    public static void main(String[] args) {
        SendGift sg = new SendGift();
        Thread t1 = new Thread(sg,"t1");
        Thread t2 = new Thread(sg,"t2");
        t1.start();
        t2.start();
    }
}
