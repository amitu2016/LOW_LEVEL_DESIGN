package Design_Patterns.Creational.AbstarctFactory;

import Design_Patterns.Creational.AbstarctFactory.Modals.IEngine;

public interface IVehicleFactory {
    public IEngine createEngine();
    public void driveCar();
}
