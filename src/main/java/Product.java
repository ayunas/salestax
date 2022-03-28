import lombok.Getter;

@Getter
public abstract class Product {
    protected boolean taxable;
    protected double price;
}
