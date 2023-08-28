package tim.challanges.abstractchallenge;

public class CarneDeRes extends ProductsForSale{
    public CarneDeRes(String type, String desc, Double price) {
        super(type, price, desc);
    }

    @Override
    public String showDetails(){
        return "";
    }
    
}
