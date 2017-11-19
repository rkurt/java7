package examples.references.constructor.java8;

public interface PersonFactory<P extends Person> {
    P create(Integer id, String name);
}
