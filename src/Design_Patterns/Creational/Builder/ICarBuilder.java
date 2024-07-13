package Design_Patterns.Creational.Builder;

import Design_Patterns.Creational.Builder.Modals.ICar;

public interface ICarBuilder {

    public void buildEngine() ;
    public void buildChassis() ;
    public void buildTyre() ;
    public void buildBodyShell() ;

    //below method returns the final object
    public ICar build() ;
}
