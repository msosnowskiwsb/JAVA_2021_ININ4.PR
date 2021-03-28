package pl.gda.wsb;

public class Car {
    final String producer;
    final String model;
    final Integer yearOfProduction;
    Double engine;
    String color;

    public Car(String producer, String model, Integer yearOfProduction, Double engine, String color) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.engine = engine;
        this.color = color;
    }
}