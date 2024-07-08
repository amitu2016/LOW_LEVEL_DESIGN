package Design_Patterns.FactoryMethod;

import Design_Patterns.FactoryMethod.Modals.ScorpioClassicBodyShell;
import Design_Patterns.FactoryMethod.Modals.ScorpioClassicEngine;

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
