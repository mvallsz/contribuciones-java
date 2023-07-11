package tim.exercises.polymorphism.challenge1;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public static Car getCar (char type) {
        return switch (type) {
          case 'E' -> new ElectricCar("Electric Car", 10, 5);
          case 'G' -> new GasCar("Gas Car", 4, 6);
          case 'H' -> new HybridCar("Hybrid Car", 8, 5, 4);
            default -> new Car("Generic Car");
        };
    }
    public void startEngine(){
         System.out.println("Starting Engine");

     }

     public void drive(){
         System.out.println("Driving");
     }

     protected void runEngine(){
         System.out.println("Run Engine!!");
     }

}

class GasCar extends Car{


    double avgKmPerLitre;
    int cylinders;

    public GasCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        this.runEngine();
        super.startEngine();
        System.out.printf("... %s%n".repeat(3), "BRUMMMM", "BRUMMMM", "BRUMMMM");
        System.out.println("Engine Started!!");
    }

    @Override
    public void drive() {
        System.out.println("Configuring driving settings for Gas Cars");
        System.out.println("All driving settings are set it place");
        super.drive();
        System.out.println("Enjoy your Drive");
    }

    @Override
    protected void runEngine() {
        System.out.println("check Gas levels");
        System.out.println("check Oils levels");
        super.runEngine();
    }
}

class ElectricCar extends Car{

    double avgKmPerCharge;
    int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        this.runEngine();
        super.startEngine();
        System.out.printf("... %s%n".repeat(3), "ZUMMMMM", "ZUMMMMM", "ZUMMMMM");
        System.out.println("Engine Started!!");
    }

    @Override
    public void drive() {
        System.out.println("Configuring driving settings for Electric Cars");
        System.out.println("All driving settings are set it place");
        super.drive();
        System.out.println("Enjoy your Drive");
    }

    @Override
    protected void runEngine() {
        System.out.println("check Battery levels");
        System.out.println("check continuity system");
        super.runEngine();
    }
}

class HybridCar extends Car{

    double avgKmPerLitre;
    int cylinders;
    int batterySize;

    public HybridCar(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        this.runEngine();
        super.startEngine();
        System.out.printf("... %s%n".repeat(4), "ZUMMMMM", "BRUMMMM", "ZUMMMMM", "BRUMMMM");
        System.out.println("Engine Started!!");
    }

    @Override
    public void drive() {
        System.out.println("Configuring driving settings for Hybrid Cars");
        System.out.println("All driving settings are set it place");
        super.drive();
        System.out.println("Enjoy your Drive");
    }

    @Override
    protected void runEngine() {
        System.out.println("check Gas levels");
        System.out.println("check Oils levels");
        System.out.println("check Battery levels");
        System.out.println("check continuity system");
        super.runEngine();
    }

}

