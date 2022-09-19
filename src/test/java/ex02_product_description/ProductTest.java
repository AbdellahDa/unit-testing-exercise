package ex02_product_description;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ProductTest {
    private Product product;

    @Test
    void nameNull() {
        product = new Product(null, null, null);
        assertNull(product.productDescription(), "if name is null, productDescription MUST also be null");
    }

    @Test
    void sizeAndPercentageNull() {
        product = new Product("fles cola", null, null);
        assertEquals("", product.productDescription());
    }

    @Test
    void PercentageNull() {
        product = new Product("fles cola", 33, null);
        assertEquals(" , 33CL", product.productDescription());
    }
    @Test
    void sizeNull() {
        product = new Product("fles cola", null, 6.0);
        assertEquals(" , 33CL", product.productDescription());
    }
}
