package pl.gda.wsb;

import pl.gda.wsb.creatures.Animal;
import pl.gda.wsb.creatures.FarmAnimal;
import pl.gda.wsb.creatures.Human;
import pl.gda.wsb.creatures.Pet;
import pl.gda.wsb.devices.Car;
import pl.gda.wsb.devices.Phone;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        Pet animal1 = new Pet("mouse", "Jerry");
        FarmAnimal animal2 = new FarmAnimal("cow", "Krasula");

        Human human1 = new Human("Jan", "Nowak", "UX Designer");
        Human human2 = new Human("Janusz", "Kowalski", "Manual Tester");
        Human human3 = new Human("Keith", "Yellowstone", "Project Manager");
        Human human4 = new Human("Keith", "Yellowstone", "Project Manager");

        Phone phone1 = new Phone(Producer.SAMSUNG, "S10", 2019,8.5);
        Phone phone2 = new Phone(Producer.NOKIA, "5.1", 2020, 7.0);

        Car car1 = new Car(Producer.KIA, "CARRENS", 2017, 1.8, "black", 25600.0);

        System.out.println(animal1);
        System.out.println(animal1.getName());

        ArrayList<Human> humansList = new ArrayList<>();
        humansList.add(human1);
        humansList.add(human2);
        humansList.add(human3);
        humansList.add(human4);

        System.out.println("Lista humans:");

        FileWriter fw = new FileWriter("human.txt", false);
        for (Human human : humansList) {
            System.out.println(human);
            fw.write(human.getFirstName() + " " + human.getLastName() + " , " + human.getPosition() + "\n");
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

        human1.setSalary(12500.0);
        human1.setCar(car1);
        human1.setPet(animal1);

        if (human1.getCar() != null)
        System.out.println(human1.getFirstName() + " have a car: " + human1.getCar().getProducer() + " " + human1.getCar().getModel() + " and have a pet " + human1.getPet().getName() + " (" + human1.getPet().getSpecies() + ")");

        System.out.println("\n----------------\n");

        if (human3.equals(human4)) System.out.println("Wynik porównania: TRUE");
        else System.out.println("Wynik porównania: FALSE\n");

        System.out.println(car1);
        System.out.println(human1);
        System.out.println(phone1);
        System.out.println(animal1);

        System.out.println("\n----------------\n");

        System.out.println("Wypłata: " +human1.getSalary() + "\n");

        human1.setSalary(-900.0);
        human1.setSalary(13000.0);

        System.out.println("\n----------------\n");

        car1.turnOn();
        phone1.turnOn();

        System.out.println("\n----------------\n");

        try {
            car1.sell(human1,human3,9800.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        human4.setPhone(phone1);

        try {
            phone1.sell(human4,human2,890.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            animal1.sell(human1,human2,1420.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
