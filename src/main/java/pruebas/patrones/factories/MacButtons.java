package pruebas.patrones.factories;

public class MacButtons implements Buttons{
    @Override
    public void imprimir() {
        System.out.println("imprimir boton de mac");
    }

    @Override
    public void renderizar() {
        System.out.println("Renderizar boton de mac");
    }
}
