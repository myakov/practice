package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExamples {
    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper = new Person("Bert Cooper", 100);

        List<Person> madMen = new ArrayList<Person>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);

        madMen.sort(new AgeComparator());

        System.out.println(madMen);

        madMen.sort(new Reverser<>(new AgeComparator()));

        System.out.println(madMen);
    }

}
