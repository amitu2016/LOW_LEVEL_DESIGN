package Design_Patterns.Singleton;

public class SingletonLazyInitialization {

    private SingletonLazyInitialization(){
        System.out.println("Instance Created");
    }

    private static class Holder{
        private static final SingletonLazyInitialization INSTANCE =
                new SingletonLazyInitialization();
    }

    public static SingletonLazyInitialization getInstance(){
        return Holder.INSTANCE;
    }

}
