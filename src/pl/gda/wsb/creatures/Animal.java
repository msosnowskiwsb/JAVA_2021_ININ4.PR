package pl.gda.wsb.creatures;

import pl.gda.wsb.Saleable;

public class Animal implements Saleable {
    final String species;
    String name;
    double weight;

    public static final Double DEFAULT_MOUSE_WEIGHT = 1.0;
    public static final Double DEFAULT_LION_WEIGHT = 120.0;
    public static final Double DEFAULT_WEIGHT = 2.0;

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
        if (species.equals("mouse")) {
            this.weight = DEFAULT_MOUSE_WEIGHT;
        } else if (species.equals("lion")) {
            this.weight = DEFAULT_LION_WEIGHT;
        } else this.weight = DEFAULT_WEIGHT;
    }

    public Animal(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void feed() {
        if (weight <= 0) {
            System.out.println("To late :(");
        } else {
            weight++;
            System.out.println(this.species + "--> thx :) my weight is now " + this.weight);
        }
    }

    public void takeForAWalk() {
        weight--;
        if (weight <= 0) {
            System.out.println("No! The " + this.species + " is dead :( You can't go for a walk with a dead animal.");
        } else if (weight <= 3) {
            System.out.println(this.species + "--> Yeaaah :) but I am hungry...");
        } else {
            System.out.println(this.species + "--> Thx for a walk bro, my weight is now: " + this.weight);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {

        if (this instanceof Human) {
            throw new Exception("Nie można sprzedawać ludzi!");
        } else {
            if (buyer.getCash() >= price) {
                if (seller.getPet() == this) {
                    buyer.setPet(this);
                    seller.setPet(null);
                    buyer.setCash(buyer.getCash() - price);
                    seller.setCash(seller.getCash() + price);
                    System.out.println("\nSprzedano zwierzę: " + this.species + " " + this.name + ". Kupił " + buyer.getLastName() + " od " + seller.getLastName() + " za " + price + ".");
                    System.out.println(buyer.getLastName() + " ma teraz " + buyer.getCash() + ", a " + seller.getLastName() + " ma " + seller.getCash() + ".");
                    System.out.println(seller.getLastName() + " ma zwierzę: " + seller.getPet());
                    System.out.println(buyer.getLastName() + " ma zwierzę: " + buyer.getPet());
                } else {
                    throw new Exception("Klient nie ma tego zwierzęcia");
                }
            } else {
                throw new Exception("Klient nie ma tyle kasy!");
            }
        }
    }
}
