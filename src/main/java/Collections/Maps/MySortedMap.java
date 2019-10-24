package Collections.Maps;


import java.util.SortedMap;
import java.util.TreeMap;

public class MySortedMap {

    public static void main(String[] args) {

        SortedMap<String, String> map = new TreeMap<>();
        map.put("2222", "ghi");
        map.put("3333", "abc");
        map.put("1111", "def");
        map.put("6666", "xyz");
        map.put("4444", "mno");
        map.put("5555", "pqr");


        // Sorted map
        map.forEach((k, v) -> System.out.println(k + " | " + v));

        System.out.println();

        // head map containing elements exclusive 3333 and after ones
        SortedMap<String, String> hMmap = map.headMap("3333");
        hMmap.forEach((k, v) -> System.out.println(k + " | " + v));

        System.out.println();

        // tail map containing elements inclusive 3333 and after ones
        SortedMap<String, String> tMap = map.tailMap("3333");
        tMap.forEach((k, v) -> System.out.println(k + " | " + v));


    }


}
