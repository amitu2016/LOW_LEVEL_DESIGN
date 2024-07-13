package Design_Patterns.Structural.Composite;

public class Client {

    public static void main(String[] args) {
        UIComponent component = new Menu();

        component.add(new Button());
        component.add(new Button());

        Button btn = new Button();
        component.add(btn);

        component.draw();

        component.remove(btn);


        component.draw();
    }
}
