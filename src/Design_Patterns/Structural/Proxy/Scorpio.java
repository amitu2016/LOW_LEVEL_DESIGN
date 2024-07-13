package Design_Patterns.Structural.Proxy;

public class Scorpio implements ICar{
    @Override
    public void turnLeft() {
        System.out.println("Scorpio turning left");
    }

    @Override
    public void turnRight() {
        System.out.println("Scorpio turning right");
    }

    @Override
    public void turnStraight() {
        System.out.println("Scorpio turning straight");
    }
}
