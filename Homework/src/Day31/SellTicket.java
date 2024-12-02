package Day31;

public class SellTicket extends Thread{
    static int tickets=0;

    public SellTicket() {
    }

    public SellTicket(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(true){
            synchronized (SellTicket.class) {
                if(tickets>1000){
                    break;
                }else{
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    tickets+=1;
                    System.out.println(getName()+":票还剩"+(1000-tickets)+"张");
                }
            }
        }
    }
}
