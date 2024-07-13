package Design_Patterns.Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        HotAirBalloon balloon = new HotAirBalloon();
        Adapter adapter = new Adapter(balloon);
        adapter.start();
    }
}
