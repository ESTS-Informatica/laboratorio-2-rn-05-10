
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PropertyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PropertyTest
{
    private Property property1;
    
    /**
     * Default constructor for test class PropertyTest
     */
    public PropertyTest()
    {
        
    }

    @Test
    public void testConstrutor() {
        property1= new Property("T3 Monte Belo", 150000.0);
        assertEquals("T3 Monte Belo", property1.getDescription());
        assertEquals(150000.0, property1.getPrice());
    }
    
    @Test
    public void testToString() {
        property1 = new Property("T3 Monte Belo", 150000.0);
        assertEquals("Descricao: T3 Monte Belo\nPreco: 150000.0", property1.toString());
    }
}