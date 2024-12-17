package Day32;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Test3_1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(52000);
        Socket socket = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;
        while((b=br.read())!=-1){
            System.out.println((char)b);
        }
        br.close();
        ss.close();
    }
}
