package tim.challanges.abstractchallenge;

public abstract class ProductsForSale {
    private String type;
    protected Double price;
    private String desc;


    public ProductsForSale(String type, Double price, String desc) {
        this.type = type;
        this.price = price;
        this.desc = desc;
    }

    public Double getPrice(int quantity) {
        return quantity * this.price;
    }

    public void printPricedLine(int quantity) {
        System.out.println(quantity + " of "+ this.desc +" priced in " + this.price + " for a total of: " + this.getPrice(quantity));
    }

    public abstract String showDetails();
}
