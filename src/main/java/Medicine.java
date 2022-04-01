

public class Medicine extends Product{

    Medicine(boolean taxable, boolean imported, double price) {
        super(taxable, imported, price);
    }

    Medicine(boolean imported, double price) {
        super(false,imported,price);
    }
}
