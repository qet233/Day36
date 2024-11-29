package Day27;

import java.io.File;

public class IO_5 {
    public static void main(String[] args) {
        File file = new File("E:\\Game\\XD5828\\附件");
        System.out.println(getLen(file));
    }
    public static long getLen(File src){
        Long len = 0L;
        File[] files = src.listFiles();
        for (File f : files) {
            if(f.isFile()){
                len+=f.length();
            }else{
                len+=getLen(f);
            }
        }
        return len;
    }


}
