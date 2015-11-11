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
class Inventory {
    Item[] item;
    static int total_number_items;
    
    
    public Inventory(){
        newInventory();
        
    }

    private void newInventory() {
    this.item=new Item[1];
    item[0] = new Weapon("knife");
    
    }
    
    public void printInventory(){
        System.out.println("Inventory: ");
        for (int i = 0; i < total_number_items; i++) {
            System.out.println(i+ ": " +item[i]);
        }
    }
    
    
    
    
    
    
    
    
}
