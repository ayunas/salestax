import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SalesTaxTest {

    @Test
    void SalesTaxClassExists() {
        SalesTax stax = new SalesTax();
    }

    @Test
    void oneBook_at_1249_noTax() {
        Book book = new Book(12.49);
        SalesTax salesTax = new SalesTax();
        assertEquals(0.0,salesTax.calcTax(book));
    }

    @Test
    void oneCD_at_1499_150_Tax() {
        Product CD = new CD(14.99);
        SalesTax salesTax = new SalesTax();
        assertEquals(1.50,salesTax.calcTax(CD));
    }

    @Test
    void oneChocolateBar_noTax() {
        Chocolate choco = new Chocolate(.85);
    }


}
