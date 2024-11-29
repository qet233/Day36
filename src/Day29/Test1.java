package Day29;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("read.txt"));
        BufferedWriter bw= new BufferedWriter(new FileWriter("x.txt"));
        ArrayList<String> list = new ArrayList<>();
        String b;
        while ((b=br.readLine())!=null){
            list.add(b);
        }
        Collections.sort(list, (String o1, String o2) ->{
                return Integer.parseInt(String.valueOf(o1.charAt(0)))-Integer.parseInt(String.valueOf(o2.charAt(0)));
            });
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
