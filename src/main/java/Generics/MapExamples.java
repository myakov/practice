package Generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class MapExamples {
    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper = new Person("test", 100);
        Predicate<String> p = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };



        // Generic Type with two type parameters
        Map<String, Person> personByName = new HashMap<>();

        // generic put method - parameterized by both key and value
        personByName.put(donDraper.getName(), donDraper);
        personByName.put(peggyOlson.getName(), peggyOlson);
        personByName.put(bertCooper.getName(), bertCooper);

        personByName.computeIfPresent("Plson", (k, v) -> new Person("Peggy Olson", 190));
        personByName.computeIfAbsent("test3", k -> new Person("test3", 44));
        // Point out hashcode/equals is used here as well
        // System.out.println("Don is " + personByName.get("Don Draper"));

        // foreach key
        for (String name : personByName.keySet()) {
            System.out.println(name);
        }

        // foreach value
        for (Person person : personByName.values()) {
            System.out.println(person);
        }

        // foreach entry - again two generic parameters
        for (Entry<String, Person> entry : personByName.entrySet()) {
            System.out.println(entry);
        }
    }
}
