package Design_Patterns.Creational.Singleton;

public class SingletonDoubleLocking {


    private static SingletonDoubleLocking instance = null;

    private  SingletonDoubleLocking(){
        System.out.println("Object Created");
    }

    public synchronized static SingletonDoubleLocking getInstance(){
        if (instance == null){
            synchronized (SingletonDoubleLocking.class){
                if (instance == null){
                    instance = new SingletonDoubleLocking();
                }
            }
        }
        return instance;
    }
}
