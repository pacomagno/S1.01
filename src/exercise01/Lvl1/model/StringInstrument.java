package exercise01.Lvl1.model;

public class StringInstrument extends Instrument {
    static {
        System.out.println("Loading StringInstrument");
    }

    public StringInstrument(String name, Double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("Playing String Instrument");
    }

}
