package Day27;

import java.io.File;

public class IO_2 {
    public static void main(String[] args) {
        File file = new File("E:\\Game");
        boolean b = haveTXT(file);
        System.out.println(b);
    }
    public static boolean haveTXT(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile()&&f.getName().endsWith(".txt")){
                System.out.println(f);
                return true;
            }
        }
        return false;
    }
}
