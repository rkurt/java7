package excercises.default_static;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Java8Demo implements MathResults {
    public static void main(String args[]) {

        Java8Demo java8Demo = new Java8Demo();

        List<Integer> integers = java8Demo.getIntegersForDemo();

        java8Demo.getResult(integers, Collections::max, MathResults::printMax);

        java8Demo.getResult(integers, Collections::min, MathResults::printMin);
    }

    private void getResult(List<Integer> integers,
                           Function<List<Integer>, Integer> function,
                           Consumer<Integer> resultPrinter) {
        int result = function.apply(integers);
        resultPrinter.accept(result);
    }
}
