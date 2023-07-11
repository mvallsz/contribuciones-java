package pruebas.patrones.factories;

public class AbstracFactoryApp {
    private Buttons boton;

    public AbstracFactoryApp(GuiFactory factory){
        boton = factory.createButtons();
    }

    public void printButtons(){
        boton.imprimir();
        boton.renderizar();
    }
}
