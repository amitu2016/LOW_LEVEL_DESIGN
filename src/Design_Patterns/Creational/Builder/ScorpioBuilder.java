package Design_Patterns.Creational.Builder;

import Design_Patterns.Creational.Builder.Modals.ICar;
import Design_Patterns.Creational.Builder.Modals.Scorpio;

public class ScorpioBuilder implements ICarBuilder{

    Scorpio scorpio;

    @Override
    public void buildEngine() {
        System.out.println("Scorpio Engine Built");
    }

    @Override
    public void buildChassis() {
        System.out.println("Scorpio Chassis Built");
    }

    @Override
    public void buildTyre() {
        System.out.println("Scorpio Tyre Built");
    }

    @Override
    public void buildBodyShell() {
        System.out.println("Scorpio Body Shell Built");
    }

    @Override
    public ICar build() {
        System.out.println("Scorpio is Ready");
        return scorpio;
    }
}
