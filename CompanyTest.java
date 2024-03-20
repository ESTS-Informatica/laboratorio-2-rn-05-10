

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    private Company company;
    private User client1;
    private User client2;
    private User seller1;
    private User seller2;
    private User seller3;
    private User seller4;
    private User client3;
    private User client4;
    private User client5;
    private Property property1;
    private Property property2;
    private Property property3;
    private Property property4;
    
    /**
     * Default constructor for test class CompanyTest
     */
    public CompanyTest()
    {
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        company = new Company();
        client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        client2 = new User("António Francisco", "922222222", "tochico@yahoo.com");
        client3 = new User("João Dão", "912723872", "jojoa@yahoo.com");
        seller1 = new User("Fernando Fernandes", "966777101", "fefe@yahoo.com");
        seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@yahoo.com");
        seller3 = new User("Tiago Paiva", "932192182", "titi@yahoo.com");
        property1 = new Property("Casa do Mato", 200450.0);
        property2 = new Property("Casa da Aldeia", 239040.0);
        property3 = new Property("Casa do Andre", 354570.0);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testConstructor() {
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
    }
    
    @Test
    public void testRegisterClient() {
        assertTrue(company.registerClient(client1));
    }
    
    @Test
    public void testRegisterClients() {
        assertTrue(company.registerClient(client2));
        assertTrue(company.registerClient(client3));
    }
    
    @Test
    public void testRegisterClientDuplicate() {
        assertTrue(company.registerClient(client3));
        assertFalse(company.registerClient(client3));
    }
    
    @Test
    public void testRegisterClientNull() {
        client4 = new User(null, null, null);
        assertTrue(company.registerClient(client4));
    }
    
    @Test
    public void testRegisterSeller() {
        assertTrue(company.registerSeller(seller1));
    }
    
    @Test
    public void testRegisterSellers() {
        assertTrue(company.registerSeller(seller2));
        assertTrue(company.registerSeller(seller3));
    }
    
    @Test
    public void testRegisterSellerDuplicate() {
        assertTrue(company.registerSeller(seller3));
        assertFalse(company.registerSeller(seller3));
    }
    
    @Test
    public void testRegisterSellerNull() {
        seller4 = new User(null, null, null);
        assertTrue(company.registerSeller(seller4));
    }
    
    @Test
    public void testRegisterProperty() {
        assertTrue(company.registerProperty(property1));
    }
    
    @Test
    public void testRegisterProperties() {
        assertTrue(company.registerProperty(property2));
        assertTrue(company.registerProperty(property3));
    }
    
    @Test
    public void testRegisterPropertyDuplicate() {
        assertTrue(company.registerProperty(property3));
        assertFalse(company.registerProperty(property3));
    }
    
    @Test
    public void testRegisterPropertyNull() {
        property4 = new Property(null, 0.0);
        assertTrue(company.registerProperty(property4));
    }
}
