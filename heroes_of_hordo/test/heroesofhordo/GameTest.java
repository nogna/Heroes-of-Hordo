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
 * DONE
 * @author Nogna
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of newItem method, of class Game.
     */
    @Test
    public void testNewItem() {
        System.out.println("newItem");
        String new_item = "Stick";
        Game instance = new Game();
        String expResult = "Stick";
        Item result = instance.NewItem(new_item);
        Item.equal(result, expResult);
        
    }
    
}
