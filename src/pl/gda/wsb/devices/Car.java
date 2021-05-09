package pl.gda.wsb.devices;

import pl.gda.wsb.Producer;

public class Car extends Device{
    private Double value;
    public Double engine;
    public String color;

    public Car(Producer producer, String model, Integer yearOfProduction, Double engine, String color, Double value) {
        super(producer,model,yearOfProduction);
        this.engine = engine;
        this.color = color;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Producer getProducer() {
        return producer;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public Double getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer=" + producer +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engine=" + engine +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Wrrrr.......");
    }
}