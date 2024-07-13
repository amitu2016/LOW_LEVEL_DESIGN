package Design_Patterns.Structural.Composite;

public interface UIComponent {
    void draw();
    void add(UIComponent component);
    void remove(UIComponent component);
}
