package collectionAndLists;

import java.util.*;

public class MaPDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        //OR
        Map<String, Integer> map2 = new HashMap<>();

        map.put("us","United States");
        map.put("in","India");
        map.putIfAbsent("in","India2");
        map.put("en","England");

        Set<String> set = map.keySet();
        System.out.println(set);

        ArrayList<String> keys = new ArrayList<>(map.keySet());
        System.out.println(keys);

        Set<String> values = (Set<String>) map.values();

        map.remove("us","United States");
        System.out.println(map);
        map.remove("us");
        System.out.println(map.containsKey("in"));
        System.out.println(map);
        System.out.println(map2);



        System.out.println(map.getOrDefault("en","others"));
        System.out.println(map.getOrDefault("pn","others"));
        System.out.println("contains value: "+map.containsValue("india"));
    }
}
