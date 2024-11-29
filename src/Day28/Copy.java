package Day28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\test.jpg");
        FileOutputStream fos = new FileOutputStream("copy.jpg");
        byte[] b = new byte[1024];
        int len;
        while((len=fis.read(b))!=-1){
            fos.write(b,0,len);
        }
        fos.close();
        fis.close();
    }
}
