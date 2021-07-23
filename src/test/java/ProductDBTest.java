import org.junit.jupiter.api.Test;
import repositories.ProductDB;

import static org.junit.jupiter.api.Assertions.*;

public class ProductDBTest {

    @Test
    public void testProductDbEntries3(){

        // Given
        ProductDB productDB = new ProductDB();
        // When
        int actualSize = productDB.list().size();
        // Then
        int expectedSize = 3;
        assertEquals(expectedSize, actualSize);

    }

}
