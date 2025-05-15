package exercise01.Lvl1.model;

public class PercusionInstrument extends Instrument {
    static {
        System.out.println("Loading PercusionInstrument");
    }

    public PercusionInstrument(String name, Double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("Playing Percusion instrument");
    }

}
