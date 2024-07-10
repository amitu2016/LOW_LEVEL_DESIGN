package Design_Patterns.Singleton;

public class Main {

    public static void main(String[] args) {
//        Singleton obj1 = Singleton.getInstance();
//        Singleton obj2 = Singleton.getInstance();

        Thread t1 = new Thread(SingletonDoubleLocking::getInstance);
        Thread t2 = new Thread(SingletonDoubleLocking::getInstance);

        t1.start();
        t2.start();
    }
}
