package pl.gda.wsb;

import pl.gda.wsb.devices.Car;

import java.util.Objects;

public class Human {
    String firstName;
    String lastName;
    String position;
    Animal pet;
    Car car;

    public Human(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return Objects.equals(firstName, human.firstName) &&
                Objects.equals(lastName, human.lastName) &&
                Objects.equals(position, human.position) &&
                Objects.equals(pet, human.pet) &&
                Objects.equals(car, human.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, position, pet, car);
    }

    @Override
    public String toString() {
        return "First name: " + firstName +
                ", last name: " + lastName +
                ", position: " + position;
    }
}

