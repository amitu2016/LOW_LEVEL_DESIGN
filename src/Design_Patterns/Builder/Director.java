package Design_Patterns.Builder;

public class Director {
    ICarBuilder carBuilder;

    public Director(ICarBuilder builder) {
        this.carBuilder = builder;
    }

    //instruction
    public void construct(boolean tyreNeeded, boolean engineNeeded, boolean bodyNeeded, boolean chassisNeeded) {
        if(engineNeeded) {
            carBuilder.buildEngine();
        }

        if(tyreNeeded) {
            carBuilder.buildTyre();
        }

        if (chassisNeeded){
            carBuilder.buildChassis();
        }

        if(bodyNeeded) {
            carBuilder.buildBodyShell();
        }

    }
}
