package Day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("5481");
        list.add("132");
        list.add("222");
        list.stream().forEach(s-> System.out.println(s));
        System.out.println("========================================");
        HashMap<String, String> hm = new HashMap<>();
        hm.put("AEJ","BXZ");
        hm.put("jSW","nYX");
        hm.put("DaG","GxU");
        hm.put("WtM","VyY");
        hm.put("OAI","BAF");
        hm.put("ZXI","WFZ");
        hm.put("MqI","VuC");
        hm.put("aaa","ifo");
        hm.put("YCp","ZTs");
        hm.put("RTv","YXs");
        hm.put("YCd","ALf");
        hm.keySet().stream().forEach(s-> System.out.println(s+" "+hm.get(s)));
        hm.entrySet().stream().forEach(s-> System.out.println(s));
        System.out.println("========================================");
        int[] arr1 ={1,2,3,4,5,6,7,8};
        String[] arr2 ={"a","ab","abc"};
        Arrays.stream(arr1).forEach(s-> System.out.println(s));
        Arrays.stream(arr2).forEach(s-> System.out.println(s));
        System.out.println("========================================");
        Stream.of(1,2,3,4,5,6).forEach(s-> System.out.println(s));
    }
}
