package tim.challanges.abstractchallenge;

import java.util.ArrayList;
import java.util.Objects;

record OrderItem(int quantity, ProductsForSale product) {
    
    public OrderItem {
        Objects.requireNonNull(quantity);
        Objects.requireNonNull(product);
    }

    public OrderItem (ProductsForSale p) {
        this(0, p);
    }

}

public class Store {
    public ArrayList<ProductsForSale> productsList;

    public Store(){
        this.productsList = new ArrayList<>();
    }
    
    public void addItemToOrder(ArrayList<OrderItem> order, OrderItem item) {
        order.add(item);
    }
    
    public void printOrder(ArrayList<OrderItem> order){
        System.out.println("Order to Display");
        System.out.println("-".repeat(30));
        System.out.println("Qty." + "-".repeat(3)+" Desc." + "-".repeat(3) + " price");

        for (OrderItem item : order) {
            item.product().printPricedLine(item.quantity());            
        }        
    }

    public static void main(String[] args) {
        
        HarinaMaiz harinaPan = new HarinaMaiz("harina", "Harina de Maiz marca PAN", 1.15);
        CarneDeRes lomito = new CarneDeRes("carne", "Corte de lomito de Res", 7.7);
        JamonDeCerdo jamonPlumrose = new JamonDeCerdo("embutido", "Jamon de pierna marca plumrose", 6.15);

        Store tiendita = new Store();

        tiendita.productsList.add(harinaPan);
        tiendita.productsList.add(lomito);
        tiendita.productsList.add(jamonPlumrose);

        ArrayList<OrderItem> ordenList = new ArrayList<OrderItem>();
        
        tiendita.addItemToOrder(ordenList, new OrderItem(4, jamonPlumrose));
        tiendita.addItemToOrder(ordenList, new OrderItem(2, lomito));
        tiendita.addItemToOrder(ordenList, new OrderItem(12, harinaPan));

        tiendita.printOrder(ordenList);
    }
}
