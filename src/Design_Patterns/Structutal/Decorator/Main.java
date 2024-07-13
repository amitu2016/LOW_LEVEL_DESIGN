package Design_Patterns.Structutal.Decorator;

public class Main {
    public static void main(String[] args) {

        ICar scorpio = new Scorpio();
        ICar bulletProofScorpio = new BulletProofScorpio(scorpio);
        float totalWeight = bulletProofScorpio.getWeight();
        System.out.println("Weight : "+totalWeight);
    }
}
