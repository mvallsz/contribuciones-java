package tim.challanges.abstractchallenge;

public class JamonDeCerdo extends ProductsForSale{
    public JamonDeCerdo(String type, String desc, Double price) {
        super(type, price, desc);
    }

    @Override
    public String showDetails(){
        return "";
    }
    
}
