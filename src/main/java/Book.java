import lombok.Getter;

@Getter
public class Book extends Product {

    public Book(double price) {
        this.price = price;
        this.taxable = false;
    }
}
