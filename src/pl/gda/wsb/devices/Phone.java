package pl.gda.wsb.devices;

import pl.gda.wsb.Producer;

public class Phone extends Device{
    double screenSize;

    public Phone(Producer producer, String model, Integer yearOfProduction, double screenSize) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println(this.producer + " " + this.model + " jest gotowy do pracy!");
    }
}
