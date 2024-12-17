package Day32;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Test2_1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        ds.receive(dp);

        byte[] data =dp.getData();
        int len =dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();

        System.out.println(new String(data,0,len)+" 地址为"+address+" 端口为"+port);
    }
}
