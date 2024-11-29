package Day31;

public class SellTickte extends Thread {
    static int tickets=0;
    static Object obj = new Object();
    public SellTickte() {
    }

    public SellTickte(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(true){
                if (extracted()) break;
        }
    }

    private static synchronized boolean extracted() {
        if(tickets <100){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            tickets++;
            System.out.println(Thread.currentThread().getName()+"在卖第"+tickets+"张票！");
        }else{
            return true;
        }
        return false;
    }
}
