package Day28;

import java.io.*;

public class Q_1 {
    public static void main(String[] args) throws IOException {
        File src = new File("E:\\Minecraft\\PCL");
        File dest = new File("E:\\Test");
        copydir(src,dest);
    }
    public static void copydir(File src,File dest) throws IOException {
        dest.mkdirs();
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                FileInputStream fis =new FileInputStream(file);
                FileOutputStream fos =new FileOutputStream(new File(dest,file.getName()));
                int len;
                byte[] b = new byte[1024];
                while((len=fis.read(b))!=-1){
                    fos.write(b,0,len);
                }
                fos.close();
                fis.close();
            }else{
                copydir(file,new File(dest,file.getName()));
            }
        }
    }
}
