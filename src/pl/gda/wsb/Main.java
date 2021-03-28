package pl.gda.wsb;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        Animal animal1 = new Animal("mouse", "Jerry");
        Animal animal2 = new Animal("lion", "Mufasa");

        Human human1 = new Human("Jan", "Nowak", "UX Designer");
        Human human2 = new Human("Janusz", "Kowalski", "Manual Tester");
        Human human3 = new Human("Keith", "Yellowstone", "Project Manager");
        Human human4 = new Human("Keith", "Yellowstone", "Project Manager");

        Phone phone1 = new Phone("Samsung", "S10", 8.5);
        Phone phone2 = new Phone("Nokia", "5.1", 7.0);

        Car car1 = new Car(Producer.KIA, "CARRENS", 2017, 1.8, "black");

        System.out.println(animal1);
        System.out.println(animal1.name);

        Animal animalWithMaxWeiht = animal1.weight > animal2.weight ? animal1 : animal2;
        StringBuilder animalWithMaxWeightDesription = new StringBuilder()
                .append("The heaviest animal: ")
                .append(animalWithMaxWeiht.species)
                .append(" ")
                .append(animalWithMaxWeiht.name)
                .append(". His weight: ")
                .append(animalWithMaxWeiht.weight)
                .append(" kg.");
        System.out.println(animalWithMaxWeightDesription);
        System.out.println("\n----------------\n");

        ArrayList<Human> humansList = new ArrayList<>();
        humansList.add(human1);
        humansList.add(human2);
        humansList.add(human3);

        System.out.println("Lista humans:");

        FileWriter fw = new FileWriter("human.txt", false);
        for (Human human : humansList) {
            System.out.println(human);
            fw.write(human.firstName + " " + human.lastName + " , " + human.position + "\n");
        }
        fw.close();

        System.out.println("\n----------------\n");


        animal2.feed();
        animal2.takeForAWalk();

        animal1.feed();
        animal1.feed();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.feed();

        System.out.println("\n----------------\n");

        human1.car = car1;
        human1.pet = animal1;

        System.out.println(human1.firstName + " have a car: " + human1.car.producer + " " + human1.car.model + " and have a pet " + human1.pet.name + " (" + human1.pet.species + ")");

        System.out.println("\n----------------\n");

        if (human3.equals(human4)) System.out.println("Wynik porównania: TRUE");
        else System.out.println("Wynik porównania: FALSE\n");

        System.out.println(car1);
        System.out.println(human1);
        System.out.println(phone1);
        System.out.println(animal1);
    }

}
