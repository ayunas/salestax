import lombok.Getter;

@Getter
public class Book extends Product {

    public Book(double price) {
        super(false,price);
    }
}
