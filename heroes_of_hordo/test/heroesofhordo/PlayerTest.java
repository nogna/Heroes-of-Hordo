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
 *  TODO
 * @author Nogna
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTotalPlayerNumber method, of class Player.
     */
    @Test
    public void testGetTotalPlayerNumber() {
        System.out.println("getTotalPlayerNumber");
        Player instance = null;
        int expResult = 0;
        int result = instance.getTotalPlayerNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer method, of class Player.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        Player instance = null;
        int expResult = 0;
        int result = instance.getPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHero method, of class Player.
     */
    @Test
    public void testGetHero() {
        System.out.println("getHero");
        Player instance = null;
        Hero expResult = null;
        Hero result = instance.getHero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
