package Collections.ComparatorAndComparable;

import java.util.ArrayList;

public class CollectionFeatures {


    public static void main(String[] args) {

        ArrayList<MyClass> list = new ArrayList<>();
        MyClass m1 = new MyClass("m1", "abc");
        MyClass m2 = new MyClass("m2", "xyz");
        MyClass m3 = new MyClass("m3", "abc");

        list.add(m1);
        list.add(m2);
        list.add(m3);

        list.forEach(m -> System.out.println(m.getLabel()));

        list.removeIf(m -> m.getValue().equals("m3"));

        list.forEach(m -> System.out.println(m.getLabel()));

    }

}

