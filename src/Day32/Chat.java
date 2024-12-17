package Day32;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Chat {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        Scanner sc= new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if(str.equals("886")){
                break;
            }
            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,10086);
            ds.send(dp);
        }
        ds.close();
    }
}
