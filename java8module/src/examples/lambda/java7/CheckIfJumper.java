package examples.lambda.java7;

public class CheckIfJumper implements CheckSkill {

    @Override
    public boolean test(Animal a) {
        return a.canJump();
    }
}
