package exercise01.Lvl1.model;

public class WindInstrument extends Instrument {
    static {
        System.out.println("Loading WindInstrument");
    }

    public WindInstrument(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("Playing Wind Instrument");
    }

}

