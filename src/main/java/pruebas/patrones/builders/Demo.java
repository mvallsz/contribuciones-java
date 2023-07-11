package pruebas.patrones.builders;

public class Demo {
    public static void main(String[] args) {
        Director dir = new Director();
        CarBuilder builder = new CarBuilder();

        dir.contructSportCar(builder, "Rojo");
        Car carro = builder.getCar();
        System.out.println(carro);

        dir.contructSedanCar(builder, "Blanco");
        Car carroSedan = builder.getCar();
        System.out.println(carroSedan);

        TruckBuilder tBuilder = new TruckBuilder();

        dir.contructTruckCar(tBuilder, "Negro");
        Truck truck = tBuilder.getTruck();
        System.out.println(truck);
    }
}
