package Day26;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        String key ="1";
        String value ="2";
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0;i<11;i++) {
            for (int j = 0;j<3;j++) {
                int choice = r.nextInt(2)>0?65:97;
                sb.append((char)(choice+r.nextInt(26)));
                sb1.append((char)(choice+r.nextInt(26)));
            }
            key=sb.toString();
            value=sb1.toString();
            sb.delete(0,sb.length());
            sb1.delete(0,sb1.length());
            System.out.println("hm.put(\""+key+"\",\""+value+"\");");
        }
    }
}
