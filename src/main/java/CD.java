import lombok.Getter;

@Getter
public class CD extends Product {

    public CD(double price, boolean imported) {
        super(true,imported,price);
    }

    @Override
    public String toString() {
        return "CD{" +
                "taxable=" + taxable +
                ", price=" + price +
                '}';
    }
}
