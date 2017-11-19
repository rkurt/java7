package examples.references.constructor.java7;

public interface PersonFactory<P extends Person> {
    P create(Integer id, String name);
}
