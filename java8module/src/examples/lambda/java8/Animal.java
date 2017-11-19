package examples.lambda.java8;

public class Animal {

    private String species;
    private boolean canJump;
    private boolean canSwim;

    public Animal(String species, boolean canJump, boolean canSwim) {
        this.species = species;
        this.canJump = canJump;
        this.canSwim = canSwim;
    }

    public String getSpecies() {
        return species;
    }

    public boolean canJump() {
        return canJump;
    }

    public boolean canSwim() {
        return canSwim;
    }
}
