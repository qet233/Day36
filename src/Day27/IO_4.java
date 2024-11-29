package Day27;

import java.io.File;

public class IO_4 {
    public static void main(String[] args) {
    File file = new File("E:\\Game\\game");
//    createDirectory(file);
    delDirectory(file);
    }
    public static void createDirectory(File file){
        File src1 = new File("E:\\Game\\game\\aaa\\eee");
        File src2 = new File("E:\\Game\\game\\bbb\\eee");
        src1.mkdirs();
        src2.mkdirs();
    }
    public static  void delDirectory(File file){
        File[] files = file.listFiles();
            for (File f : files) {
                if(f.isFile()){
                    f.delete();
                }else{
                    delDirectory(f);
                }
            }
            file.delete();
    }
}
