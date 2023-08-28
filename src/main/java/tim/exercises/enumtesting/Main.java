package tim.exercises.enumtesting;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DiasDeLaSemana dia = DiasDeLaSemana.LUNES;

        System.out.println(dia.name());
        System.out.println(dia.ordinal());
        System.out.println(randomDay());

        for (int i = 0; i < 100; i++) {
            dia = randomDay();
            if(dia.name() == "MARTES") {
                Toppings toppingDelDia = Toppings.TOCINETA;
                System.out.printf("El topping del dia es %s, y el precio es de %.2f%n", toppingDelDia.name(), toppingDelDia.obtenerPrecio());
            }
        }

    }


    public static DiasDeLaSemana randomDay() {
        int randomNumber = new Random().nextInt(7);
        var todosLosDias = DiasDeLaSemana.values();
        return todosLosDias[randomNumber];
    }
}