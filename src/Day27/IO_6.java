package Day27;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IO_6 {
    public static void main(String[] args) {
        File file = new File("E:\\Game\\XD5828\\附件");
        HashMap<String,Integer> hm = getSum(file);
        System.out.println(hm);
    }
    public static HashMap<String,Integer> getSum(File src){
        HashMap<String,Integer> hm = new HashMap<>();
        File[] files = src.listFiles();
        for (File f : files) {
            if(f.isFile()){
                String name = f.getName();
                String[] arr = name.split("\\.");
                String endName = arr[arr.length - 1];
                if(hm.containsKey(endName)){
                    hm.put(endName,hm.get(endName)+1);
                } else {
                    hm.put(endName,1);
                }
            }else{
                HashMap<String, Integer> sonMap = getSum(f);
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    if(hm.containsKey(key)){
                        hm.put(key,hm.get(key)+value);
                    }else{
                        hm.put(key,value);
                    }
                }
            }
        }
        return hm;
    }
}
