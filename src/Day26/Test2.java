package Day26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("111","222");
        hm.put("vJb","gBh");
        hm.put("JZP","AWV");
        hm.put("bUS","bAY");
        hm.put("vpr","xsq");
        hm.put("pIn","zFb");
        hm.put("EAq","RHr");
        hm.put("UIK","OKQ");
        hm.put("Nje","Cnn");
        hm.put("WMS","HQW");
        hm.put("Hrz","Gya");
        hm.put("oBi","hKg");
        Map<String, String> map = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
        Map<String, String> map1 = Map.copyOf(hm);
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s+" "+map.get(s));
        }
    }
}
