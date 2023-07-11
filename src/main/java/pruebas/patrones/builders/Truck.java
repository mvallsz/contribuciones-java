package pruebas.patrones.builders;

import pruebas.patrones.builders.components.Motor;
import pruebas.patrones.builders.components.Trasmision;

public class Truck {
    private String color;
    private int doors;
    private int seats;
    private Motor motor;
    private Trasmision trans;
    private static final CarTypes carType = CarTypes.TRUCK;
    private String fuelType;

    public Truck(String color, int doors, int seats, Motor motor, Trasmision trans, String fuelType) {
        this.color = color;
        this.doors = doors;
        this.seats = seats;
        this.motor = motor;
        this.trans = trans;
        this.fuelType = fuelType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setTrans(Trasmision trans) {
        this.trans = trans;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "color='" + color + '\'' +
                ", doors=" + doors +
                ", seats=" + seats +
                ", motor=" + motor.getVolume() +
                ", trans=" + trans +
                ", carType=" + carType +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
