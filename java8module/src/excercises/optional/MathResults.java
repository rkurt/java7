package excercises.optional;

import java.util.List;

public interface MathResults {

    static void printMax(Integer s) {
        System.out.println("Wynik działania metody max = " + s);
    }

    static void printMin(Integer s) {
        System.out.println("Wynik działania metody min = " + s);
    }

    default List<Integer> getIntegersForDemo() {
        return null;
    }
}
