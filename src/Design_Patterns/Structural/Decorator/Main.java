package Design_Patterns.Structural.Decorator;

public class Main {
    public static void main(String[] args) {

        ICar scorpio = new Scorpio();
        ICar bulletProofScorpio = new BulletProofScorpio(scorpio);
        float totalWeight = bulletProofScorpio.getWeight();
        System.out.println("Weight : "+totalWeight);
    }
}
