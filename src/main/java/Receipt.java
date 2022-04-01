import org.apache.commons.math3.util.Precision;

import java.util.HashMap;
import java.util.List;

public class Receipt {
    private List<Product> products;
    private HashMap<String,Double> receipt = new HashMap<>();
    Double totalTax = 0.0;
    Double total = 0.0;

    public Receipt(List<Product> products) {
        this.products = products;
    }

    public Receipt() {}

    public HashMap<String, Double> tabulate() {

        for (int i = 0; i < products.size(); i++) {
            receipt.put(products.get(i).getClass().getSimpleName(), products.get(i).getPrice());
            Double tax = calcTax(products.get(i));
            totalTax += tax;
        }
        Double subtotal = sumPrices(products);
        total = subtotal + totalTax;
        receipt.put("Sales Tax: ",totalTax);
        receipt.put("Total: ", Precision.round(total,2));
        return receipt;
    }

    public double sumPrices(List<Product> products) {
        Double subtotal = 0.0;

        for(Product prod : products) {
            subtotal += prod.getPrice();
        }
        return subtotal;
    }

    public double calcTax(Product product) {
        double tax = 0.0;


        if(product.imported == true) {
            tax = product.getPrice() * .05;
        }

        if(product.taxable == true) {
            tax = tax + product.getPrice() * .10;
        }
        return Precision.round(tax,2);
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "products=" + products +
                '}';
    }
}
