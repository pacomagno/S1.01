package exercise01.Lvl1.App;

import exercise01.Lvl1.model.PercusionInstrument;
import exercise01.Lvl1.model.StringInstrument;
import exercise01.Lvl1.model.WindInstrument;

public class Main {
    public static void main(String[] args) {

        WindInstrument saxofone = new WindInstrument("Saxsofone", 560.50);
        saxofone.play();
        System.out.println();
        StringInstrument violin = new StringInstrument("Violin", 1250.50);
        violin.play();
        System.out.println();
        PercusionInstrument drums = new PercusionInstrument("Drums", 450.50);
        drums.play();
        System.out.println();
    }
}
