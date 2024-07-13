package Design_Patterns.Structural.Bridge;

public class Client {
    public static void main(String[] args) {
        AbstractScorpio scorpio = new ScorpioN(new ScorpioN_Impl_India());
        System.out.println(scorpio.isRightHanded());
    }
}
