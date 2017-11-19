package excercises.references;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Java8Demo {
    public static void main(String args[]) {

        Java8Demo java8Demo = new Java8Demo();
        List<Integer> integers = Arrays.asList(-2, -22, 4, 0, 1);

        java8Demo.getResult(integers, Collections::max, Java8Demo::printMax);

        java8Demo.getResult(integers, Collections::min, Java8Demo::printMin);
    }

    private static void printMax(Integer s) {
        System.out.println("Wynik działania metody max = " + s);
    }

    private static void printMin(Integer s) {
        System.out.println("Wynik działania metody min = " + s);
    }

    private void getResult(List<Integer> integers,
                           Function<List<Integer>, Integer> function,
                           Consumer<Integer> resultPrinter) {
        int result = function.apply(integers);
        resultPrinter.accept(result);
    }
}
