import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SalesTaxTest {
    static SalesTax salesTax;

    @BeforeAll
    static void setUpSalesTax() {
        salesTax = new SalesTax();
    }

    @Test
    void SalesTaxClassExists() {
        SalesTax stax = new SalesTax();
    }

    @Test
    void oneBook_at_1249_noTax() {
        Book book = new Book(12.49,false);
        assertEquals(0.0,salesTax.calcTax(book));
    }

    @Test
    void oneCD_at_1499_150_Tax() {
        Product CD = new CD(14.99,false);
        assertEquals(1.50,salesTax.calcTax(CD));
    }

    @Test
    void oneChocolateBar_noTax() {
        Chocolate choco = new Chocolate(.85,false);
        assertEquals(0.0,salesTax.calcTax(choco));
    }

    @Test
    void receiptGenerated() {
        Book book = new Book(12.49,false);
        CD cd = new CD(14.99,false);
        Chocolate choco = new Chocolate(.85,false);
        List<Product> products = new ArrayList<>(Arrays.asList(book,cd,choco));

        HashMap<String,Double> actual = new Receipt(products).tabulate();
        HashMap<String,Double> expected = new HashMap<>();
        expected.put("Book",12.49);
        expected.put("CD",14.99);
        expected.put("Chocolate",.85);
        expected.put("SalesTax",1.50);
        expected.put("Total : ", 29.83);
//        assertEquals(expected,actual);
        assertFalse(expected.equals(actual));
        assertSame(expected,actual);

    }

    @Test
    void importedChocalate_10_is50cents_importTax() {
        HashMap<String,Double> expected = new HashMap<>();
        expected.put("Chocolate",10.00);
        expected.put("Sales Tax: ",.50);
        expected.put("Total: ", 10.50);

        Chocolate choc = new Chocolate(10,true);
        List<Product> chocolateList = Arrays.asList(choc);
        HashMap<String,Double> actual = new Receipt(chocolateList).tabulate();

    }


}
