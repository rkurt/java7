package excercises.default_static;

import java.util.Arrays;
import java.util.List;

public interface MathResults {

    static void printMax(Integer s) {
        System.out.println("Wynik działania metody max = " + s);
    }

    static void printMin(Integer s) {
        System.out.println("Wynik działania metody min = " + s);
    }

    default List<Integer> getIntegersForDemo() {
        return Arrays.asList(-2, -22, 4, 0, 1);
    }
}
