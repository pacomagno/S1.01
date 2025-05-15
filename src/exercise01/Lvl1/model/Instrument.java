package exercise01.Lvl1.model;

public abstract class Instrument {

    private String name;
    private double price;

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;

    }
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }


    public abstract void play();

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
