package pl.gda.wsb.creatures;

public class FarmAnimal extends Animal implements Edible, Feedable{

    public FarmAnimal(String species) {
        super(species);
    }

    public FarmAnimal(String species, String name){
        super(species, name);
    }

    @Override
    public String toString() {
        return "FarmAnimal: " + this.species;
    }

    @Override
    public void feed(Double foodWeight) {
        this.weight = weight + foodWeight;
    }

    @Override
    public void beEaten() {
        this.weight = 0.0;
        System.out.println("adios");
    }
}