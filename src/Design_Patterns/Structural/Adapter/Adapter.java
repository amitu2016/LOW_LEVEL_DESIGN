package Design_Patterns.Structural.Adapter;

public class Adapter implements ICar{

    HotAirBalloon hotAirBalloon;

    public Adapter(HotAirBalloon hotAirBalloon){
        this.hotAirBalloon = hotAirBalloon;
    }

    @Override
    public void start() {
        String gasToBeUsed = hotAirBalloon.getGasUsed();
        hotAirBalloon.start(gasToBeUsed);
    }
}
