package tim.exercises.constructor.tests;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(String name, String email) {
        this(name, 0.0, email);
    }

    public Customer(){
        this("Default Name", "email@default.com");
    }


    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
