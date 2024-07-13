package Design_Patterns.Structutal.Decorator;

public class Scorpio implements ICar{
    @Override
    public void start() {
        System.out.println("Starting");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }

    @Override
    public float getWeight() {
        return baseWeight;
    }
}
