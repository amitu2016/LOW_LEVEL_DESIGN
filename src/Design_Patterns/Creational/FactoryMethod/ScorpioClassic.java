package Design_Patterns.Creational.FactoryMethod;

import Design_Patterns.Creational.FactoryMethod.Modals.ScorpioClassicBodyShell;
import Design_Patterns.Creational.FactoryMethod.Modals.ScorpioClassicEngine;

public class ScorpioClassic extends Scorpio{

    @Override
    public void makeScorpio() {
       this.engine = new ScorpioClassicEngine();
       this.bodyShell = new ScorpioClassicBodyShell();
        System.out.println("Creating Scorpio Classic Car");
    }

    @Override
    public void driveCar() {
      makeScorpio();
      System.out.println("Driving Scorpio Classic Car");
    }
}
