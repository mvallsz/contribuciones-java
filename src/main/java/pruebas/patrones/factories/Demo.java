package pruebas.patrones.factories;

public class Demo {


    private static AbstracFactoryApp configureApplication() {
        AbstracFactoryApp application;
        GuiFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        if(osName.contains("mac")){
            factory = new MacFactory();
        } else {
            factory = new WinFactory();
        }

        application = new AbstracFactoryApp(factory);
        return application;
    }

    public static void main(String[] args) {
        AbstracFactoryApp app = configureApplication();
        app.printButtons();
    }


}
