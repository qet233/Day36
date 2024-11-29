package Day24;

import java.util.*;

public class Test_HashMap_plus {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};
        Random r= new Random();
        HashMap<String ,Integer> hm = new HashMap<>();
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (int i = 0; i < 80; i++) {
            int i1 = r.nextInt(arr.length);
            String s = arr[i1];
            if(hm.containsKey(s)){
                Integer count = hm.get(s);
                count++;
                hm.put(s,count);
            }else{
                hm.put(s,1);
            }
        }
        System.out.println(hm);
        int max= 0;
        String name="";
        for (Map.Entry<String, Integer> entry : entries) {
            Integer value = entry.getValue();
            if(value>max){
                max=value;
                name=entry.getKey();
            }
        }
        System.out.println("最大的是:"+name+" "+max);
    }
}
