package examples.lambda.java7;

public class CheckIfSwimmer implements CheckSkill {

    @Override
    public boolean test(Animal a) {
        return a.canSwim();
    }
}
