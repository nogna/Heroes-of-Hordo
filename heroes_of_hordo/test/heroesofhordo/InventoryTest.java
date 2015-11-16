/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesofhordo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * TODO
 *
 * @author Nogna
 */
public class InventoryTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    public InventoryTest() {
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
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
        Item new_item = new Item("Spoon");
        Inventory instance = new Inventory();
        String[] expResult = {"Tiny knife", "Spoon"};
        instance.updateInventory(new_item);
        assertTrue(Inventory.equal(instance, expResult, instance.getTotalNumberItems()));

    }

    /**
     * Test of printInventory method, of class Inventory.
     */
    @Test
    public void testPrintInventory() {
        System.out.println("printInventory");
        Inventory instance = new Inventory();
        instance.updateInventory(new Item("Spoon"));
        instance.printInventory();
        //assertEquals("printInventory Inventory: 1: Knife ", outContent.toString());

    }

    /**
     * Test of getTotalNumberItems method, of class Inventory.
     */
    @Test
    public void testGetTotalNumberItems() {
        System.out.println("getTotalNumberItems");
        Inventory instance = new Inventory();
        int expResult = 1;
        int result = instance.getTotalNumberItems();
        assertEquals(expResult, result);
    }

    /**
     * Test of equal method, of class Inventory.
     */
    @Test
    public void testEqual() {
        System.out.println("equal");
        Inventory result_2 = new Inventory();
        String[] b = {"Tiny knife"};
        int j = 1;
        boolean expResult = true;
        boolean result = Inventory.equal(result_2, b, j);
        assertEquals(expResult, result);

    }

    /**
     * Test of getItem method, of class Inventory.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        int ItemIndex = 1;
        Inventory instance = new Inventory();
        Item expResult1 = new Item("Knife");
        Item expResult2 = new Item("Spoon");
        instance.updateInventory(expResult1);
        instance.updateInventory(expResult2);
        Item result = instance.getItem(ItemIndex);
        assertTrue(expResult1.equals(result));
        assertFalse(expResult2.equals(result));
    }

}
