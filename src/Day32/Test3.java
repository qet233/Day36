package Day32;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",52000);
        OutputStream os = socket.getOutputStream();
        os.write("陈yx是大傻逼!".getBytes());
        os.close();
        socket.close();
    }
}
