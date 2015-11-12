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
public class InventoryTest {
    
    public InventoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of updateInventory method, of class Inventory.
     */
    @Test
    public void testUpdateInventory() {
        System.out.println("updateInventory");
        Item new_item = null;
        Inventory instance = new Inventory();
        Item[] expResult = null;
        Item[] result = instance.updateInventory(new_item);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printInventory method, of class Inventory.
     */
    @Test
    public void testPrintInventory() {
        System.out.println("printInventory");
        Inventory instance = new Inventory();
        instance.printInventory();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
