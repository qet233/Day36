package Day28;

import java.io.*;

public class Q_2 {
    public static void main(String[] args) throws IOException {
        File src = new File("read.txt");
        File dest = new File("x.txt");
        encryptionAndReduction(src,dest);
    }
    public static void encryptionAndReduction(File src, File dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);
        int b;
        while((b=fis.read())!=-1){
            fos.write(b^2);
        }
        fos.close();
        fis.close();
    }
}
