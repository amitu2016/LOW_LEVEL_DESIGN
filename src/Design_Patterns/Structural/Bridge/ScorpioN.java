package Design_Patterns.Structural.Bridge;

public class ScorpioN extends AbstractScorpio{


    public ScorpioN(AbstractScorpioImpl scorpioImpl) {
        super(scorpioImpl);
    }


    @Override
    public boolean isRightHanded() {
        return abstractScorpioImpl.isRightHanded();
    }

    @Override
    public void printSafetyRequirements() {
        abstractScorpioImpl.printSafetyRequirements();
    }
}
