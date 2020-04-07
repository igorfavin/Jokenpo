//Nunca havia trabalhado com nenhum framework de testes, tentei mas não consegui.

package jokenpo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class JokenpoTest {
    
    public JokenpoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        String v1 = new String();
        String v2 = new String();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Jokenpo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Jokenpo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
