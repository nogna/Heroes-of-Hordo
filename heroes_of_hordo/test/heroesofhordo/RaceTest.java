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
 *  DONE
 * @author Nogna
 */
public class RaceTest {
    
    public RaceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testEqualRace() {
    Race a = new Race(1);
    Race b = new Race(2);
    Race c = new Race(2);
    
    assertFalse(Race.equalRace(a, c));
    assertTrue(Race.equalRace(b,c));
    }
    @Test
    public void testEqualStats(){
    Race a = new Race(1);
    Race b = new Race(2);
    Race c = new Race(2);
    
    assertFalse(Race.equalStats(a,b));
    assertTrue(Race.equalStats(b,c));
    
    }


}
