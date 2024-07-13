package Design_Patterns.Creational.AbstarctFactory;

import Design_Patterns.Creational.AbstarctFactory.Modals.IEngine;
import Design_Patterns.Creational.AbstarctFactory.Modals.ScorpioEngine;

public class BoleroFactory implements IVehicleFactory{
    @Override
    public IEngine createEngine() {
        System.out.println("Creating Bolero Engine");
        return new ScorpioEngine();
    }

    @Override
    public void driveCar() {
        createEngine();
        System.out.println("Driving Bolero Car");
    }
}
