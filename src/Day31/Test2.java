package Day31;

public class Test2 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
            }

        }.start();
    }
}
