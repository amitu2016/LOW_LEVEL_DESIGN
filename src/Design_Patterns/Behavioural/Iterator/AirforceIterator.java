package Design_Patterns.Behavioural.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AirforceIterator implements CustomIterator{

    List<IAircraft> jets;
    IAircraft[] helios;
    Set<IAircraft> cargos;

    int jetsPos = 0;
    int heliosPos = 0;
    int cargoPos = 0;

    public AirforceIterator(AirForce airForce){
        jets = airForce.getJets();
        helios = airForce.getHelios();
        cargos = airForce.getCargo();
    }

    @Override
    public IAircraft next() {
        if(heliosPos < helios.length) {
            return helios[heliosPos++];
        }

        if(jetsPos < jets.size()) {
            return jets.get(jetsPos++);
        }

        if(cargoPos < cargos.size()) {
            List<IAircraft> cargoList = new ArrayList<>(cargos);
            return cargoList.get(cargoPos++);
        }
        //next element not available
        throw new RuntimeException("No more elements");
    }

    @Override
    public boolean hasNext() {
        return helios.length > heliosPos || jets.size() > jetsPos || cargos.size() > cargoPos;
    }
}
