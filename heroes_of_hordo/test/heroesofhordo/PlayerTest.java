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
     * Test of getPlayer method, of class Player.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        Player test_player1 = new Player(1);
        Player test_player2 = new Player(2);
        int expResult = 2;
        int result = test_player2.getPlayer();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getHero method, of class Player.
     */
    @Test
    public void testGetHero() {
        System.out.println("getHero");
        Player instance = new Player(1);
        Hero expResult = new Hero();
        Hero result = instance.getHero();
        expResult.equals(result);
        
    }
    
    /**
     * Test of getTotalPlayerNumber method, of class Player.
     */
    
    @Test
    public void testGetTotalPlayerNumber() {
        System.out.println("getTotalPlayerNumber");
        Player test_player1 = new Player(1);
        Player test_player2 = new Player(2);
        Player test_player3 = new Player(3);
        int expResult = 3;
        int result = test_player1.getTotalPlayerNumber();
        assertEquals(expResult, result);
    }

    
}
