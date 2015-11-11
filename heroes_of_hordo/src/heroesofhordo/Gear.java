/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesofhordo;

/**
 *
 * @author Nogna
 */
class Gear {
    Item helm, turso, pants, boots;
    
    public Gear(){
        this.boots = new Item("boots");
        this.helm = new Item("helm");
        this.pants = new Item("pants");
        this.turso = new Item("turso");
        
        
    }
}
