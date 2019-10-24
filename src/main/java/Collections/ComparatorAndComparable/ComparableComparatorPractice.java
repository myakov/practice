package Collections.ComparatorAndComparable;

import java.util.TreeSet;

public class ComparableComparatorPractice {


    public static void main(String[] args) {


        TreeSet<MyClass> comparableTree = new TreeSet<>();

        comparableTree.add(new MyClass("2222", "ghi"));
        comparableTree.add(new MyClass("3333", "abc"));
        comparableTree.add(new MyClass("1111", "def"));

        comparableTree.forEach(m -> System.out.println(m));

        System.out.println("=============");

        TreeSet<MyClass> comparatorTree = new TreeSet<>(new MyComparator());
        comparatorTree.add(new MyClass("2222", "ghi"));
        comparatorTree.add(new MyClass("3333", "abc"));
        comparatorTree.add(new MyClass("1111", "def"));

        comparatorTree.forEach(m -> System.out.println(m));


    }
}
