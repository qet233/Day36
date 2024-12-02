package Day31;

public class Odd implements Runnable{
    int num = 1;
    @Override
    public void run() {
        while(true){
            synchronized (Odd.class) {
                if(num==100){
                    break;
                }else if(num%2==1){
                    System.out.println(Thread.currentThread().getName()+":"+num);
                    num++;
                }else{
                    num++;
                }
            }
        }
    }
}
