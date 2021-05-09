package pl.gda.wsb;

public interface Saleable {
    void sell (Human seller, Human buyer, Double price) throws Exception;
}
