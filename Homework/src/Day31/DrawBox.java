package Day31;

import java.util.ArrayList;
import java.util.Collections;

public class DrawBox extends Thread{
    ArrayList<Integer> list;
    DrawBox(ArrayList<Integer> list){
        this.list=list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (DrawBox.class) {
                if (list.size()==0) {
                    System.out.println(getName()+"抽完了");
                    break;
                }
                else
                {
                    Collections.shuffle(list);
                    Integer i = list.remove(0);
                    System.out.println(getName()+"又产生一个"+i+"元的大奖");
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
