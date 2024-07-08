package Design_Patterns.AbstarctFactory;

import Design_Patterns.AbstarctFactory.Modals.IEngine;

public interface IVehicleFactory {
    public IEngine createEngine();
    public void driveCar();
}
