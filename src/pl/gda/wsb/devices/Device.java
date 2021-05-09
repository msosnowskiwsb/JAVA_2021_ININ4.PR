package pl.gda.wsb.devices;

import pl.gda.wsb.Saleable;

public abstract class Device implements Saleable {
    public final Producer producer;
    public final Integer yearOfProduction;
    public final String model;

    public Device(Producer producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.model = model;
    }

    public abstract void turnOn();
}
