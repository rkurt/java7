package examples.references.constructor.java8;

public class Person {

    private Integer id;
    private String name;

    public Person() {
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create(1, "Martyna");

        System.out.println(person.id + " " + person.name);
    }
}
