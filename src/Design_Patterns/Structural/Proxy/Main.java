package Design_Patterns.Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        ICar scorpio = new ScorpioRemoteProxy();
        scorpio.turnLeft();
        scorpio.turnRight();
        scorpio.turnStraight();
    }
}
