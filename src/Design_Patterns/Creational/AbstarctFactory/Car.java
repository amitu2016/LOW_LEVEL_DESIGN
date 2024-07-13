package Design_Patterns.Creational.AbstarctFactory;

import Design_Patterns.Creational.AbstarctFactory.Modals.IEngine;

public class Car {

    IEngine engine;
    IVehicleFactory factory;

    Car(IVehicleFactory factory){
        this.factory = factory;
    }

    public void driveCar(){
        engine = factory.createEngine();
        System.out.println("Car Created. Now Drive");
    }
}