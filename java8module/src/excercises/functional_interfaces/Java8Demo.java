package excercises.functional_interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Java8Demo {
    public static void main(String args[]) {

        Java8Demo java8Demo = new Java8Demo();

        List<Integer> integers = Arrays.asList(-2, -22, 4, 0, 1);

        java8Demo.getResult(integers, i -> Collections.max(i), (s) -> System.out.println("Wynik działania metody = " + s));

        java8Demo.getResult(integers, i -> Collections.min(i), (s) -> System.out.println("Wynik działania metody = " + s));
    }

    private void getResult(List<Integer> integers,
                           Function<List<Integer>, Integer> function,
                           Consumer<Integer> resultPrinter) {
        int result = function.apply(integers);
        resultPrinter.accept(result);
    }
}
