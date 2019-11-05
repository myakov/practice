package Collections.Sets;

import java.util.EnumSet;

enum EnumSetValues {

    CODE, LEARN, CONTRIBUTE, QUIZ, MCQ

}

public class EnumSetExample {


    public static void main(String[] args) {

        // Creating a set
        EnumSet<EnumSetValues> set1, set2, set3, set4;

        // Adding elements
        set1 = EnumSet.of(EnumSetValues.QUIZ, EnumSetValues.CONTRIBUTE, EnumSetValues.LEARN, EnumSetValues.CODE);
        set2 = EnumSet.complementOf(set1);
        set3 = EnumSet.allOf(EnumSetValues.class);
        set4 = EnumSet.range(EnumSetValues.CODE, EnumSetValues.CONTRIBUTE);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Set 3: " + set3);
        System.out.println("Set 4: " + set4);
    }
}
