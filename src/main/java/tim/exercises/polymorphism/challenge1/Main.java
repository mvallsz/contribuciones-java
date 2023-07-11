package tim.exercises.polymorphism.challenge1;

public class Main {

    public static void main(String[] args) {
        Car car = Car.getCar('E');
        car.startEngine();
        car.drive();

        Car car2 = Car.getCar('H');
        car2.startEngine();
        car2.drive();

        Car car3 = Car.getCar('G');
        car3.startEngine();
        car3.drive();

    }
}
