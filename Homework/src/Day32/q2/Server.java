package Day32.q2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(52000);
        Socket socket = ss.accept();
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b;
        while((b=isr.read())!=-1){
            System.out.println((char)b);
        }
        OutputStream os = socket.getOutputStream();
        os.write("服务器收到数据".getBytes());
        socket.close();
//        ss.close();
    }
}
