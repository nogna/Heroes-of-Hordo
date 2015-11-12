/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesofhordo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * TODO
 * @author Nogna
 */
public class ChoiceTest {
    
    public ChoiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of printAndreturnChoices method, of class Choice.
     */
    @Test
    public void testPrintAndreturnChoices() {
        System.out.println("printAndreturnChoices");
        Choice instance = new Choice();
        String[] expResult = null;
        String[] result = instance.printAndreturnChoices();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
