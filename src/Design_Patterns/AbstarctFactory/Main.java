package Design_Patterns.AbstarctFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IVehicleFactory factory1 = new ScorpioFactory();
        IVehicleFactory factory2 = new BoleroFactory();
        Car car1 = new Car(factory1);
        Car car2  = new Car(factory2);

        List<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);

        for(Car car: list){
            car.driveCar();
        }
    }

}
