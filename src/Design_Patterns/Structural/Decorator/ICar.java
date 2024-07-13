package Design_Patterns.Structural.Decorator;

public interface ICar {
    
    public float baseWeight = 1500;
    
    public void start();
    
    public void stop();
    
    public float getWeight();
}
