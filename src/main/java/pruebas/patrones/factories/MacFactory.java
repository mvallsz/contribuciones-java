package pruebas.patrones.factories;

public class MacFactory implements GuiFactory{
    @Override
    public Buttons createButtons() {
        return new MacButtons();
    }
}
