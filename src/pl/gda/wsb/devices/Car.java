package pl.gda.wsb.devices;

import jdk.nashorn.internal.runtime.ECMAException;
import pl.gda.wsb.Human;
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

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if(!seller.hasCar(this)){
            throw new Exception("Klient nie ma tego auta!");
        }
        if (buyer.getCash() < price){
            throw new Exception("Klient nie ma tyle szmalu");
        }
        buyer.setCar(this);
        seller.removeCar();
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        System.out.println("\nSprzedano auto: " + this.producer + " " + this.model + ". Kupił " + buyer.getLastName() + " od " + seller.getLastName() + " za " + price + ".");
        System.out.println(buyer.getLastName() + " ma teraz " + buyer.getCash() + ", a " + seller.getLastName() + " ma " + seller.getCash() + ".");
        System.out.println(seller.getLastName() + " ma auto: " + seller.getCar());
        System.out.println(buyer.getLastName() + " ma auto: " + buyer.getCar());
    }
}