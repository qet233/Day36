package Day28;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Q3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("read.txt");
        int b;
        StringBuilder sb= new StringBuilder();
        while((b=fr.read())!=-1){
            sb.append((char)b);
        }
        fr.close();
        String[] arr = sb.toString().split("-");
        ArrayList<Integer> arr1=new ArrayList<>();
        for (String s1 : arr) {
            arr1.add(Integer.parseInt(s1));
        }
        Collections.sort(arr1);
        System.out.println(arr1);

        FileWriter fw = new FileWriter("x.txt");
        for (int i = 0; i < arr1.size(); i++) {
            fw.write(arr1.get(i)+"-");
        }
        fw.close();
    }
}
