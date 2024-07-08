package Design_Patterns.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Scorpio> carList = new ArrayList<>();

        Scorpio car1 = new ScorpioClassic();
        Scorpio car2 = new ScorpioN();

        carList.add(car1);
        carList.add(car2);

        for(Scorpio car: carList){
            car.driveCar();
        }
    }
}
