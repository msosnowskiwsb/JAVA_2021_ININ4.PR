package pl.gda.wsb.creatures;

public class Pet extends Animal implements Feedable{
    public Pet(String species, String name) {
        super(species, name);
    }

    public Pet(String species) {
        super(species);
    }

    @Override
    public String toString() {
        return "Pet: " + species + ", name: " + name;
    }

    @Override
    public void feed(Double foodWeight) {
        this.weight = weight + foodWeight;
    }
}