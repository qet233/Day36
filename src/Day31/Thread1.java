package Day31;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Thread1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(new MyThread1());
        MyThread2 mt2 = new MyThread2();
        FutureTask<Integer> ft = new FutureTask<>(mt2);
        Thread t2 = new Thread(ft);
        mt.setName("第一个线程");
        t1.setName("第二个线程");
        mt.setDaemon(true);
//        mt.setPriority(10);
//        t1.setPriority(1);
        mt.start();
        t1.start();
//        t2.start();
//        Integer u = ft.get();
//        System.out.println(u);
    }
}
