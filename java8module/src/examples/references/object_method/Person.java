package examples.references.object_method;

import java.util.Arrays;

public class Person {

    private Integer id;
    private String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Person[] persons = new Person[2];
        persons[0] = new Person(1, "Jan");
        persons[1] = new Person(2, "Agnieszka");

        ComparisonProvider cp = new ComparisonProvider();
        Arrays.sort(persons, cp::compareByName);

        System.out.println(persons[0].id + " " + persons[0].name);
        System.out.println(persons[1].id + " " + persons[1].name);
    }

    public String getName() {
        return name;
    }
}
