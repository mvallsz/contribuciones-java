package tim.exercises.challanges;

import java.util.ArrayList;

class Banco {
    private String name;
    private ArrayList<Cliente> clientes;
    
    public Banco(String name){
        this.name = name;
        this.clientes = new ArrayList<>(500);
        System.out.println(this.clientes.size());
    }

    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }

    public void addCustomer(Cliente cliente) {
        getClientes().add(cliente);
        System.out.printf("Se registro un nuevo cliente en el Banco %s%n", this.name);
    }

    public void addTransaccion(String name, Double transaccion){
        Cliente cliente = this.getCliente(name);
        if(cliente != null) {
            cliente.addTransaccion(transaccion);
            System.out.printf("Se ha registrado la transaccion por monto: %f, al cliente %s%n", transaccion, name);
        } else {
            System.out.printf("Cliente no registrado en el banco %s%n", this.name);
        }
    }

    public void printTransacciones(String name){
        Cliente cliente = this.getCliente(name);
        if(cliente != null) {
            cliente.printTransacciones();
        } else {
            System.out.printf("Cliente no registrado en el banco %s%n", this.name);
        }
    }

    public Cliente getCliente(String name) {
        for (Cliente cliente : this.clientes) {
            if(cliente.name == name) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("Nombre del Banco: %s.%n clientes: %s%n", this.name, this.clientes.toString());
    }

}
class Cliente {
    public String name;
    private ArrayList<Double> transacciones;

    public Cliente(String name, Double balanceInicial){
        this.name = name;
        this.transacciones = new ArrayList<>();
        this.transacciones.add(balanceInicial);
    }

    public void addTransaccion(Double transaccion) {
        this.transacciones.add(transaccion);
    }

    public ArrayList<Double> getTransacciones(){
        return this.transacciones;
    }

    public void printTransacciones(){
        System.out.printf("Transacciones de cliente: %s%n", this.name );
        System.out.println("-".repeat(30));
        for (double transaccion : this.transacciones) {
            System.out.printf("Monto: %.2f, (%s)%n", transaccion, transaccion < 0 ? "debito" : "credito");
        }
    }

}

public class AutoboxingUnboxingChallenge {
    public static void main(String[] args) {
        Banco banco1 = new Banco("BANESCO");
        Cliente cliente1 = new Cliente("Manuel Valls", 0.0);

        banco1.addCustomer(cliente1);
        banco1.addTransaccion("Manuel Valls", 400d);
        banco1.addTransaccion("Manuel Valls", -100.50);
        banco1.printTransacciones("Manuel Valls");
        banco1.addTransaccion("Pedro Martinez", 400d);

    }
}