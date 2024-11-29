package Day31;

public class SellTicketDemo {
    public static void main(String[] args) {
//        SellTickte st = new SellTickte();
//        Thread t1 = new Thread(st,"窗口一");
//        Thread t2 = new Thread(st,"窗口二");
//        Thread t3 = new Thread(st,"窗口三");
        SellTickte t1 = new SellTickte("线程1");
        SellTickte t2 = new SellTickte("线程2");
        SellTickte t3 = new SellTickte("线程3");
        t1.start();
        t2.start();
        t3.start();
    }
}
