package Java8.StreamAPIandCollectors;

import java.util.*;


public class ReductionExample {

    public static void main(String... args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Optional<Integer> red =
        list.stream()
                .reduce(Integer::max);
        
        System.out.println(red);
        System.out.println(list);
        
    }
}
