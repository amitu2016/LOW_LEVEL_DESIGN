package Design_Patterns.Builder;

import Design_Patterns.Builder.Modals.Fortuner;
import Design_Patterns.Builder.Modals.ICar;

public class FortunerBuilder implements ICarBuilder{

    Fortuner fortuner;

    @Override
    public void buildEngine() {
        System.out.println("Fortuner Engine Built");
    }

    @Override
    public void buildChassis() {
        System.out.println("Fortuner Chassis Built");
    }

    @Override
    public void buildTyre() {
        System.out.println("Fortuner Tyre Built");
    }

    @Override
    public void buildBodyShell() {
        System.out.println("Fortuner Body Shell Built");
    }

    @Override
    public ICar build() {
        System.out.println("Fortuner is Ready");
        return fortuner;
    }
}
