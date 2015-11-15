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
 * DONE
 * @author Nogna
 */
public class ChoiceRespositoryTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

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
    public ChoiceRespositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }



    /**
     * Test of printChoices method, of class Choice.
     */
    @Test
    public void testPrintChoices() {
        System.out.println("printChoices");
        ChoiceRepository instance = new ChoiceRepository();
        instance.printChoices("Sandtopia - Dark Alley");

    }


    /**
     * Test of getChoices method, of class Choice.
     */
    @Test
    public void testGetChoices() {
        System.out.println("getChoices");
        ChoiceRepository instance = new ChoiceRepository();
        
        String[] expResult1 = {"Go inside", "Knock", "Yell at the door", 
            "Search inventory", "Exit Game"};
        String[] expResult2 = {"Linger forward", "Go back outside", 
            "Look around", "Search inventory", "Exit Game"};
        
        String[] result1 = instance.getChoices("Sandtopia");
        String[] result2 = instance.getChoices("Sandtopia - Dark Alley");
        
        assertArrayEquals(expResult1, result1);
        assertArrayEquals(expResult2, result2);
        
        
    }
    
}
