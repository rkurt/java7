package examples.references.object_method;

public class ComparisonProvider {

    public int compareByName(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
}
