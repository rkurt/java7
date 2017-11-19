package examples.lambda.java8;

import java.util.ArrayList;
import java.util.List;

public class AnimalDemo {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, a -> a.canJump()); // kangaroo rabbit
        print(animals, a -> a.canSwim()); // fish turtle
    }

    private static void print(List<Animal> animals, CheckSkill checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.print(animal.getSpecies() + " ");
            }
        }
        System.out.println();
    }
}
