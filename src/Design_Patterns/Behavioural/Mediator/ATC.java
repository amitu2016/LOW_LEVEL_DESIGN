package Design_Patterns.Behavioural.Mediator;

public class ATC {

    public synchronized void requestToLand(IAircraft aircraft){
        System.out.println("Permission Granted by ATC");
        aircraft.land();
    }
}
