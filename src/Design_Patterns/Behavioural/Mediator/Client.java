package Design_Patterns.Behavioural.Mediator;

public class Client {

    public static void main(String[] args) {
        ATC atc = new ATC();

        IAircraft aircraft = new Indigo(atc);

        aircraft.requestToLand();

    }
}
