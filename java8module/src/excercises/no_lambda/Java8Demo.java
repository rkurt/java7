package excercises.no_lambda;

import java.util.Arrays;
import java.util.List;

public class Java8Demo {
    public static void main(String args[]) {

        Java8Demo java8Demo = new Java8Demo();
        List<Integer> integers = Arrays.asList(-2, -22, 4, 0, 1);

        MaxOperation maxOperation = new MaxOperation();
        java8Demo.getResult(integers, maxOperation);

        MinOperation minOperation = new MinOperation();
        java8Demo.getResult(integers, minOperation);
    }

    private void getResult(List<Integer> integers, MathOperation mathOperation) {
        int result = mathOperation.calculate(integers);
        System.out.println("Wynik działania metody = " + result);
    }
}
