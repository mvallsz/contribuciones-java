package pruebas.patrones.builders;

import pruebas.patrones.builders.components.Motor;
import pruebas.patrones.builders.components.Trasmision;

public class Director {

    public void contructSportCar(Builder builder, String color) {
        builder.setColor(color);
        builder.setDoors(2);
        builder.setMotor(new Motor(3.5, 0));
        builder.setTrasmision(Trasmision.AUTOMATIC);
        builder.setSeats(2);
        builder.setCarType(CarTypes.SPORT);
    }

    public void contructTruckCar(Builder builder, String color) {
        builder.setColor(color);
        builder.setDoors(2);
        builder.setMotor(new Motor(5.5, 0));
        builder.setTrasmision(Trasmision.MANUAL);
        builder.setSeats(2);
    }

    public void contructSedanCar(Builder builder, String color) {
        builder.setColor(color);
        builder.setDoors(4);
        builder.setMotor(new Motor(2.0, 0));
        builder.setTrasmision(Trasmision.AUTOMATIC);
        builder.setSeats(4);
        builder.setCarType(CarTypes.SEDDAN);
    }

    public void contructSUVCar(Builder builder, String color) {
        builder.setColor(color);
        builder.setDoors(5);
        builder.setMotor(new Motor(5.5, 0));
        builder.setTrasmision(Trasmision.AUTOMATIC);
        builder.setSeats(6);
        builder.setCarType(CarTypes.SUV);
    }
}
