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
 *  DONE with small bugg:)
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
        Player.total_player_number=0;
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
        System.out.println(Player.total_player_number);
        
    }
    
   /**
     * Test of getTotalPlayerNumber method, of class Player.
     */
    
    @Test
    public void testGetTotalPlayerNumber() {
        System.out.println("getTotalPlayerNumber");
        Player test_player1 = new Player(1);
        Player test_player2 = new Player(2);
        System.out.println(Player.total_player_number);
        int expResult = 3;
        int result = Player.total_player_number;
        assertEquals(expResult, result);
        Player.total_player_number=0;
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
        System.out.println(Player.total_player_number);
        
        
    }
 

    
}
