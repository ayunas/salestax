import lombok.Getter;

@Getter
public class Chocolate extends Product {

    public Chocolate(double price, boolean imported) {
        super(false,imported,price);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "taxable=" + taxable +
                ", price=" + price +
                '}';
    }
}
