package Design_Patterns.Behavioural.Iterator;

import java.util.*;

public class AirForce {

    List<IAircraft> jets = new ArrayList<>();
    IAircraft [] helios = new IAircraft[1];
    Set<IAircraft> cargo = new LinkedHashSet<>();

    public AirForce(){
        jets.add(new Tejas());
        helios[0] = new Chinook();
        cargo.add(new Boeing());
    }

    public List<IAircraft> getJets() {
        return jets;
    }

    public IAircraft[] getHelios() {
        return helios;
    }

    public Set<IAircraft> getCargo() {
        return cargo;
    }

    public CustomIterator createIterator(){
        return new AirforceIterator(this);
    }
}
