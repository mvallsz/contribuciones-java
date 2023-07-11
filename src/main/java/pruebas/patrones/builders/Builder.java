package pruebas.patrones.builders;

import pruebas.patrones.builders.components.Motor;
import pruebas.patrones.builders.components.Trasmision;

public interface Builder {
    void setColor(String color);
    void setDoors(int doors);
    void setMotor(Motor motor);
    void setTrasmision(Trasmision trans);
    void setSeats(int seats);
    void setCarType(CarTypes type);
}
