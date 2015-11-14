/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesofhordo;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.ByteArrayInputStream;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * DONE
 * @author Nogna
 */
public class HeroTest {
    
    public HeroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getAction method, of class Hero.
     */
    @Test
    public void testGetAction() {
        System.out.println("getAction");
        Hero instance = new Hero();
        String expResult = "";
        String result = instance.getAction();
        assertEquals(expResult, result);
        
        
    }
    
    /**
     * Test of getLocation method, of class Hero.
      */
    
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Hero instance = new Hero();
        String expResult = "Sandtopia";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setName method, of class Hero.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        ByteArrayInputStream in = new ByteArrayInputStream("test_hero_name".getBytes());
        System.setIn(in);
        Hero instance = new Hero();
        instance.setName();
        assertEquals(instance.name, "test_hero_name");
    }

    /**
     * Test of setRace method, of class Hero.
     */
    @Test
    public void testSetRace_0args() {
        System.out.println("setRace");
        ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
        System.setIn(in);
        Hero instance = new Hero();
        instance.setRace();
        assertEquals(instance.race.race_name, "Kraxlax");

    }

    /**
     * Test of setRace method, of class Hero.
     */
    @Test
    public void testSetRace_int() {
        System.out.println("setRace");
        int i = 1;
        String race1 = "Opopilopop";
        String race2 = "Kraxlax";
        
        Hero instance = new Hero();
        instance.setRace(i);
        assertEquals(instance.race.race_name, race1);
        assertFalse(instance.race.race_name.equals(race2));
        
    }

    /**
     * Test of setChoices method, of class Hero.
     */
    @Test
    public void testSetChoices() {
        System.out.println("setChoices");
        Hero instance = new Hero();
        String[] expResult = {"Go inside", "Knock", "Yell at the door", "Search inventory", "Exit Game"};
        instance.setChoices();
        assertTrue(Hero.equalChoice(instance.choice, expResult));
        }
        
        
}
   

