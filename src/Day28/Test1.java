package Day28;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("read.txt");
        byte[] b =new byte[4];
        int len;
        while((len=fis.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }
        fis.close();
//        FileOutputStream fos = new FileOutputStream("read.txt",true);
//        FileOutputStream fos = new FileOutputStream("read.txt");
//        byte[] c= "\r\n".getBytes();
//        byte[] b = "cyxdsb".getBytes();
//        fos.write(b);
//        fos.close();
    }
}
