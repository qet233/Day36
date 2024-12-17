package Day32.q2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket= new Socket("127.0.0.1",52000);
        OutputStream os = socket.getOutputStream();
        os.write("我是大傻逼".getBytes());
        socket.shutdownOutput();
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b;
        while((b=isr.read())!=-1){
            System.out.println((char)b);
        }
        socket.close();
    }
}
