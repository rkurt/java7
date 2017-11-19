package examples.references.class_method;

import java.util.Arrays;

public class SortString {

    public static void main(String[] args) {
        String[] persons = {"Jan", "Agnieszka"};

        Arrays.sort(persons, String::compareTo);

        System.out.println(persons[0]);
        System.out.println(persons[1]);
    }
}
