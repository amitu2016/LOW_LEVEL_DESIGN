package Design_Patterns.Behavioural.Iterator;

public class Client {
    public static void main(String[] args) {
        AirForce airForce = new AirForce();

        CustomIterator allPlanes = airForce.createIterator();

        while(allPlanes.hasNext()){
            System.out.println(allPlanes.next());
        }
    }
}
