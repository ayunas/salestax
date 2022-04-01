import org.apache.commons.math3.util.Precision;

import java.util.List;

public class SalesTax {

    public double calcTax(Product product) {
        if(product.taxable == true) {
            double tax = product.getPrice() * .10;
            return Precision.round(tax,2);
        } else {
            return 0.0;
        }
    }

    public Receipt generateReceipt(List<Product> products) {
        return new Receipt(products);
    }
}
