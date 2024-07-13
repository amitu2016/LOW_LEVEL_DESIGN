package Design_Patterns.Creational.Builder;

import Design_Patterns.Creational.Builder.Modals.ICar;

public class Client {
    public static void main(String[] args) {
        ICarBuilder builder = new ScorpioBuilder();
        Director director = new Director(builder);

        director.construct(true, false, true, false);
        ICar car = builder.build();
    }
}
