package Day29;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("read.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("x.txt"), StandardCharsets.UTF_8);
        int b;
        while((b=isr.read())!=-1){
            osw.write(b);
        }
        osw.close();
        isr.close();
    }
}
