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
public class HeroesOfHordoTest {
    
    public HeroesOfHordoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class HeroesOfHordo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        int i =0;
        HeroesOfHordo.main(args);
        assertEquals(0,i);
    }
    
}
