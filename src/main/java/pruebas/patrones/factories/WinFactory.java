package pruebas.patrones.factories;

public class WinFactory implements GuiFactory{
    @Override
    public Buttons createButtons() {
        return new WinButtons();
    }
}
