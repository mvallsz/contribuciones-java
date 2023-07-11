package pruebas.patrones.builders;

import pruebas.patrones.builders.components.Motor;
import pruebas.patrones.builders.components.Trasmision;

public class TruckBuilder implements Builder {

    private String color;
    private int doors;
    private int seats;
    private Motor motor;
    private Trasmision trans;
    private CarTypes carType;
    private static final String fuelType = "DIESEL";


    public void setCarType(CarTypes carType) {
        this.carType = carType;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void setTrasmision(Trasmision trans) {
        this.trans = trans;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Truck getTruck(){
        return new Truck(color, doors, seats, motor, trans, fuelType);
    }
}
