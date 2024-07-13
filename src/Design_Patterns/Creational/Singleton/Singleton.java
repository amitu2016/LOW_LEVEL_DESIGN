package Design_Patterns.Creational.Singleton;

public class Singleton {

    private static Singleton instance = null;

    private  Singleton(){
        System.out.println("Object Created");
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }


}
