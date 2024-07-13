package Design_Patterns.Structural.Bridge;

public abstract class AbstractScorpio {

    AbstractScorpioImpl abstractScorpioImpl;

    public AbstractScorpio(AbstractScorpioImpl ab){
        abstractScorpioImpl = ab;
    }

    public abstract boolean isRightHanded();

    public abstract void printSafetyRequirements();
}
