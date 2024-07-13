package Design_Patterns.Structural.Adapter;

public class HotAirBalloon {

    public String gasUsed = "LPG";

    public void start(String gasUsed){
        System.out.println("Hot Air Balloon is starting");
    }

    public String getGasUsed(){
        return gasUsed;
    }
}
