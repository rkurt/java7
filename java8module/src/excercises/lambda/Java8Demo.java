package excercises.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java8Demo {
    public static void main(String args[]) {

        Java8Demo java8Demo = new Java8Demo();

        List<Integer> integers = Arrays.asList(-2, -22, 4, 0, 1);

        java8Demo.getResult(integers, i -> Collections.max(i));

        java8Demo.getResult(integers, i -> Collections.min(i));
    }

    private void getResult(List<Integer> integers, MathOperation mathOperation) {
        int result = mathOperation.calculate(integers);
        System.out.println("Wynik działania metody = " + result);
    }
}
