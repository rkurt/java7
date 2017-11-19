package excercises.optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class Java8Demo implements MathResults {
    public static void main(String args[]) {

        Java8Demo java8Demo = new Java8Demo();

        Optional<List<Integer>> integers = Optional.ofNullable(java8Demo.getIntegersForDemo());

        java8Demo.getResult(integers, Collections::max, MathResults::printMax);

        java8Demo.getResult(integers, Collections::min, MathResults::printMin);
    }

    private void getResult(Optional<List<Integer>> integers,
                           Function<List<Integer>, Integer> function,
                           Consumer<Integer> resultPrinter) {
        if (integers.isPresent()) {
            int result = function.apply(integers.get());
            resultPrinter.accept(result);
        }
    }

    @Override
    public List<Integer> getIntegersForDemo() {
        return Arrays.asList(-2, -22, 4, 0, 1);
    }
}
