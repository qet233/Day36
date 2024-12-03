package Day31;

public class Test4 {
    public static void main(String[] args) {
        redPackets rp1 = new redPackets();
        redPackets rp2 = new redPackets();
        redPackets rp3 = new redPackets();
        redPackets rp4 = new redPackets();
        redPackets rp5 = new redPackets();
        rp1.setName("线程一");
        rp2.setName("线程二");
        rp3.setName("线程三");
        rp4.setName("线程四");
        rp5.setName("线程五");
        rp1.start();
        rp2.start();
        rp3.start();
        rp4.start();
        rp5.start();
    }
}
