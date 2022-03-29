import lombok.Getter;

@Getter
public abstract class Product {
    protected boolean taxable;
    protected double price;

    Product(boolean taxable, double price) {
        this.taxable = taxable;
        this.price = price;
    }

}
