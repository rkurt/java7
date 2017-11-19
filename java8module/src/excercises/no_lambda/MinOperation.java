package excercises.no_lambda;

import java.util.Collections;
import java.util.List;

public class MinOperation implements MathOperation {

    @Override
    public Integer calculate(List<Integer> integers) {
        return Collections.min(integers);
    }
}
