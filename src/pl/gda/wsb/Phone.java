package pl.gda.wsb;

public class Phone {
    String producer;
    String model;
    double screenSize;

    public Phone(String producer, String model, double screenSize) {
        this.producer = producer;
        this.model = model;
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
}
