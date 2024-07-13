package Design_Patterns.Creational.FactoryMethod;

import Design_Patterns.Creational.FactoryMethod.Modals.IBodyShell;
import Design_Patterns.Creational.FactoryMethod.Modals.IEngine;
import Design_Patterns.Creational.FactoryMethod.Modals.ScorpioBodyShell;
import Design_Patterns.Creational.FactoryMethod.Modals.ScorpioEngine;

public class Scorpio {

    IEngine engine;
    IBodyShell bodyShell;

    public void makeScorpio(){
        System.out.println("Inside Scorpio Class");
        this.engine = new ScorpioEngine();
        this.bodyShell = new ScorpioBodyShell();
    }

    public void driveCar(){
        makeScorpio();
        System.out.println("Driving Parent Scorpio Car");
    }
}
