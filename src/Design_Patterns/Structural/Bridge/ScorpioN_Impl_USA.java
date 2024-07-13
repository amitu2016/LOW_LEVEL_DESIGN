package Design_Patterns.Structural.Bridge;

public class ScorpioN_Impl_USA extends AbstractScorpioImpl{
    @Override
    public boolean isRightHanded() {
        return false;
    }

    @Override
    public void printSafetyRequirements() {
        System.out.println("Safety Requirements in USA");
    }
}
