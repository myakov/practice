package Collections.Sets;


import java.util.*;

public class SetTreeSet {

    public static void main(String[] args) {
        // Set deonstration using HashSet 
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Geeks");
        hashSet.add("For");
        hashSet.add("Geeks");
        hashSet.add("Example");
        hashSet.add("Set");
        System.out.print("Set output without the duplicates");

        System.out.println(hashSet);

        // Set deonstration using TreeSet
        System.out.print("Sorted Set after passing into TreeSet");

        Set<String> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);


        System.out.println();

        Set<Integer> a = new HashSet<>(Arrays.asList(1, 3, 2, 4, 8, 9, 0));
        Set<Integer> b = new HashSet<>(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));

        // To find union
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
    }
} 