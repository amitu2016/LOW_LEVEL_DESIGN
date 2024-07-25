package Design_Patterns.Behavioural.Mediator;

public class Indigo implements IAircraft{

    ATC atcTower;

    public Indigo(ATC atcTower){
        this.atcTower = atcTower;
    }


    @Override
    public void land() {
        System.out.println("Indigo landing");
    }

    @Override
    public void requestToLand(){
        System.out.println("Indigo requesting permission from ATC");
        atcTower.requestToLand(this);
    }
}
