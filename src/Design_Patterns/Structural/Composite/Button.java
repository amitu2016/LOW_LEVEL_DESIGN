package Design_Patterns.Structural.Composite;

public class Button implements UIComponent{
    @Override
    public void draw() {
        System.out.println("Drawing Button");
    }

    @Override
    public void add(UIComponent component) {
        System.out.println("Adding Buttons");
    }

    @Override
    public void remove(UIComponent component) {
        System.out.println("Removing Buttons");
    }
}
