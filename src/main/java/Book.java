import lombok.Getter;

@Getter
public class Book extends Product {

    public Book(double price, boolean imported) {
        super(false,imported,price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "taxable=" + taxable +
                ", price=" + price +
                '}';
    }
}
