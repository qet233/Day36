package Day24;

import java.util.*;

public class Test_HashMap {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};
        Random r= new Random();
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            int i1 = r.nextInt(arr.length);
            al.add(arr[i1]);
        }
        System.out.println(al);
        HashMap<String ,Integer> hm = new HashMap<>();
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (String s : al) {
            if(hm.containsKey(s)){
                Integer i = hm.get(s);
                i++;
                hm.put(s,i);
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
