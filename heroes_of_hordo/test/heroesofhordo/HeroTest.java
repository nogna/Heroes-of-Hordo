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
 *
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
     * Test of getChoices method, of class Hero.
     */
    @Test
    public void testGetChoices() {
        System.out.println("getChoices");
        ChoiceRepository test = new ChoiceRepository();
        Hero instance = new Hero();
        String[] expResult = {"1: Go inside", "2: Knock", "3: Yell at the door", "4: Search inventory", "5: Exit Game"};
        String[] result = test.getChoices("Sandtopia");
        assertTrue(Hero.equalChoice(result, expResult));
    }

}
