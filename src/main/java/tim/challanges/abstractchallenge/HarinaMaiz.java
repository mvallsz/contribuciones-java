package tim.challanges.abstractchallenge;

public class HarinaMaiz extends ProductsForSale {
    
    public HarinaMaiz(String type, String desc, Double price) {
        super(type, price, desc);
    }

    @Override
    public String showDetails(){
        return "";
    }
    
}
