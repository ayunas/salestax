import lombok.Getter;

@Getter
public abstract class Product {
    protected boolean taxable;
    protected double price;
    protected boolean imported;

    Product(boolean taxable, boolean imported, double price) {
        this.taxable = taxable;
        this.price = price;
        this.imported = imported;
    }

}
