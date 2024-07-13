package Design_Patterns.Structural.Proxy;

public class ScorpioRemoteProxy implements ICar{

    private final Scorpio scorpio = new Scorpio();

    @Override
    public void turnLeft() {
        System.out.println("processing inside proxy");
        scorpio.turnLeft();
    }

    @Override
    public void turnRight() {
        System.out.println("processing inside proxy");
        scorpio.turnRight();
    }

    @Override
    public void turnStraight() {
        System.out.println("processing inside proxy");
        scorpio.turnStraight();
    }
}
