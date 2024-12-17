package Day32.q1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",52000);
        OutputStream os = socket.getOutputStream();
        Scanner sc= new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            if(str.equals("886")){
                break;
            }
            os.write(str.getBytes());
        }
        socket.close();
    }
}
