package Collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("2222", "ghi");
        map.put("3333", "abc");
        map.put("1111", "def");


//        String s1 = map.get("3333");
//        System.out.println(s1);
//
//        String s2 = map.getOrDefault("4444", "Default Value for missing key");
//        System.out.println(s2);

        map.forEach((k, v) -> System.out.println(k + " | " + v));


        System.out.println();

        map.replaceAll((k, v) -> v.toUpperCase());
        map.forEach((k, v) -> System.out.println(k + " | " + v));


    }
}
