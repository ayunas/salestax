public class Perfume extends Product {

    Perfume(boolean imported, double price) {
        super(true, imported, price);
    }

    public Perfume(boolean taxable, boolean imported, double price) {
        super(taxable, imported, price);
    }
}
