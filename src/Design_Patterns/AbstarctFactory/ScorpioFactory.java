package Design_Patterns.AbstarctFactory;

import Design_Patterns.AbstarctFactory.Modals.IEngine;
import Design_Patterns.AbstarctFactory.Modals.ScorpioEngine;

public class ScorpioFactory implements IVehicleFactory{
    @Override
    public IEngine createEngine() {
        System.out.println("Creating Scorpio Engine");
        return new ScorpioEngine();
    }

    @Override
    public void driveCar() {
        createEngine();
        System.out.println("Driving Scorpio Car");
    }
}
