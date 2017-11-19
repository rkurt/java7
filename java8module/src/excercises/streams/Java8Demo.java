package excercises.streams;

import java.time.Clock;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Demo implements MathResults {
    public static void main(String args[]) {
        Clock clock = Clock.systemDefaultZone();
        long time1 = clock.millis();

        MathResults.printStartTime(ZonedDateTime.ofInstant(clock.instant(), clock.getZone()));

        Java8Demo java8Demo = new Java8Demo();

        Optional<List<Integer>> integers = Optional.ofNullable(java8Demo.getIntegersForDemo());

        java8Demo.getResult(integers, Collections::max, MathResults::printMax);

        java8Demo.getResult(integers, Collections::min, MathResults::printMin);

        long time2 = clock.millis();
        MathResults.printDuration(Duration.ofMillis(time2 - time1));
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
        List<Integer> integers = MathResults.super.getIntegersForDemo();

        return integers.parallelStream()
                .map(i -> -i)
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());
    }
}
