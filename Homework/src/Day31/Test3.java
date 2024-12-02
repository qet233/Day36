package Day31;

public class Test3 {
    public static void main(String[] args) {
        Odd odd = new Odd();
        Thread t1 =new Thread(odd,"t1");
        Thread t2 =new Thread(odd,"t2");
        t1.start();
        t2.start();
    }
}
