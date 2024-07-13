package Design_Patterns.Structural.Decorator;

public class BulletProofScorpio extends ScorpioDecorator{

    ICar scorpio;

    public BulletProofScorpio(ICar myScorpio){
        this.scorpio = myScorpio;
    }

    @Override
    public void start() {
        scorpio.start();
    }

    @Override
    public void stop() {
        scorpio.stop();
    }

    @Override
    public float getWeight() {
        return 300f + baseWeight;
    }
}
