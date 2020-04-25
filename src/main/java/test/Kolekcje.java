package test;

import java.util.*;

public class Kolekcje {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("dfjlksf");
        list.add("dfjlksf");
        list.forEach(System.out::println);

        Set<String> set = new HashSet<>();
        set.add("ddddd");
        set.add("ddddd");
        set.forEach(System.out::println);

        Map<String, String> map = new HashMap<>();
        map.put("pierwszy1", "Pierwsza wartos");
        map.put("pierwszy", "Druga wartos");

        System.out.println(map.get("pierwszy"));

        for(String s : map.keySet()) {
            System.out.println(s + " : " + map.get(s));
        }

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }
}
