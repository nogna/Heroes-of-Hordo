/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesofhordo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nogna
 */
public class ItemTest {
    
    public ItemTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        Item a = testmakeItem("Knife");
        Item b = testmakeItem("Knife");
        Item c = testmakeItem("Spoon");
        
        
        assertTrue(Item.equal(a,b));
        assertFalse(Item.equal(a, c));
        
    }

    private Item testmakeItem(String item) {
    Item tmp_item = new Item(item);
    return tmp_item;
    
    }
    
}
