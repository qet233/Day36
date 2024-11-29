package Day27;

import java.io.File;

public class IO_3 {
    public static void main(String[] args) {
        File file = new File("E:\\");
        haveFile(file,".mp4");
//        haveTXT();
    }
    public static  void haveFile(String end){
        File[] files = File.listRoots();
        for (File file : files) {
            haveFile(file,end);
        }
    }
    public static void haveFile(File file,String end){
        File[] files = file.listFiles();
        if (files!=null) {
            for (File f : files) {
                if(f.isFile()){
                    if(f.getName().endsWith(end)){
                        System.out.println(f);
                    }
                } else
                    haveFile(f,end);
                }
        }
    }
}
