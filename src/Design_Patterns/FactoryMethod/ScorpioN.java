package Design_Patterns.FactoryMethod;

import Design_Patterns.FactoryMethod.Modals.ScorpioNBodyShell;
import Design_Patterns.FactoryMethod.Modals.ScorpioNEngine;

public class ScorpioN extends Scorpio{

    @Override
    public void makeScorpio() {
        this.bodyShell = new ScorpioNBodyShell();
        this.engine = new ScorpioNEngine();
        System.out.println("Creating Scorpio N Car");
    }

    @Override
    public void driveCar() {
        makeScorpio();
        System.out.println("Driving Scorpio N Car");
    }
}
