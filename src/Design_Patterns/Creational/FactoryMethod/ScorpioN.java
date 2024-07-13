package Design_Patterns.Creational.FactoryMethod;

import Design_Patterns.Creational.FactoryMethod.Modals.ScorpioNBodyShell;
import Design_Patterns.Creational.FactoryMethod.Modals.ScorpioNEngine;

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
