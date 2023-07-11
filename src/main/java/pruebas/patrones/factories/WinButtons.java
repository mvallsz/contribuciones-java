package pruebas.patrones.factories;

public class WinButtons implements Buttons{

    @Override
    public void imprimir(){
        System.out.println("boton de windows");
    }

    @Override
    public void renderizar() {
        System.out.println("boton de windows renderizado");
    }

}
