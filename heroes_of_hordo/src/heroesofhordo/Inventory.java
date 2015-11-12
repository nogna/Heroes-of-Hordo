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
    static int total_number_items=0;
    
    
    public Inventory(){
        newInventory();
        
    }

    private void newInventory() {
    this.item=new Item[1];
    total_number_items++;
    item[0] = new Weapon("Knife");
    
    }
    
    public void printInventory(){
        System.out.println("Inventory: ");
        for (int i = 0; i < total_number_items; i++) {
            System.out.println((i+1)+ ": " +item[i].item_name);
        }
    }
    
    
    
    
    
    
    
    
}
