package pl.gda.wsb;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        Animal animal1 = new Animal("mouse", "Jerry", 0.8);
        Animal animal2 = new Animal("lion", "Mufasa", 123.5);

        Human human1 = new Human("Jan", "Nowak", "UX Designer");
        Human human2 = new Human("Janusz", "Kowalski", "Manual Tester");
        Human human3 = new Human("Keith", "Yellowstone", "Project Manager");

        Phone phone1 = new Phone("Samsung", "S10", 8.5);
        Phone phone2 = new Phone("Nokia", "5.1", 7.0);

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
            System.out.println(human.firstName + " " + human.lastName + " , " + human.position);
            fw.write(human.firstName + " " + human.lastName + " , " + human.position + "\n");
        }
        fw.close();

    }

}
