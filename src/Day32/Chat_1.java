package Day32;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Chat_1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        while (true) {
            ds.receive(dp);
            InetAddress address = dp.getAddress();
            int port = dp.getPort();
            byte[] data = dp.getData();
            int length = dp.getLength();
            System.out.println("ip为"+address+"端口为"+port+":"+new String(data,0,length));
        }
    }
}
