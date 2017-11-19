package examples.functional_interfaces;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<String> isEmpty = (s) -> s.isEmpty();
        Predicate<String> isNotEmpty = isEmpty.negate();

        boolean b1 = isEmpty.test("isa"); // false
        boolean b2 = isNotEmpty.test("isa"); // true
        boolean b3 = isEmpty.and(isNotEmpty).test("isa"); // false
    }
}
