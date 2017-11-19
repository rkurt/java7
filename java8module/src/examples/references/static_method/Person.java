package examples.references.static_method;

import java.util.Arrays;

public class Person {

    private Integer id;
    private String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    private static int compareByName(Person a, Person b) {
        return a.name.compareTo(b.name);
    }

    public static void main(String[] args) {
        Person[] persons = new Person[2];
        persons[0] = new Person(1, "Jan");
        persons[1] = new Person(2, "Agnieszka");

        Arrays.sort(persons, Person::compareByName);

        System.out.println(persons[0].id + " " + persons[0].name);
        System.out.println(persons[1].id + " " + persons[1].name);
    }
}
