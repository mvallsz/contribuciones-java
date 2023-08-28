package tim.exercises.enumtesting;

import java.security.PublicKey;

public enum Toppings {
    MOSTAZA,
    TOCINETA,
    QUESO,
    TOMATE;

    public double obtenerPrecio(){
        return switch (this) {
            case QUESO -> 1.0;
            case TOCINETA -> 1.5;
            default -> 0.5;
        };
    }
}
