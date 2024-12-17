package Day32;

import java.io.IOException;
import java.net.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10087);

        String str="我是大傻逼！";
        byte[] bytes = str.getBytes();
        int port = 10086;
        InetAddress address = InetAddress.getByName("127.0.0.1");

        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

        ds.send(dp);

        ds.close();
    }
}
