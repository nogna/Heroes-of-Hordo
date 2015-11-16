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
public class WeaponTest {
    
    public WeaponTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testEqualWeapon() {
    Weapon a = new Weapon("Knife");
    Weapon b = new Weapon("Knife");
    Weapon c = new Weapon("Stick");
    
    assertTrue(Weapon.equalWeapon(a,b));
    assertFalse(Weapon.equalWeapon(a, c));
    }
    
    @Test
    public void testEqualStats(){
    Weapon a = new Weapon("Knife");
    Weapon b = new Weapon("Knife");
    Weapon c = new Weapon("Stick");
    
    assertTrue(Weapon.equalStats(a,b));
    assertFalse(Weapon.equalStats(a,c)); 
    
    }

 
}
