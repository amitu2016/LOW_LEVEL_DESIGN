package Design_Patterns.Structural.Bridge;

public class ScorpioN_Impl_India extends AbstractScorpioImpl{
    @Override
    public boolean isRightHanded() {
        return true;
    }

    @Override
    public void printSafetyRequirements() {
        System.out.println("Safety Requirements I  India");
    }
}
