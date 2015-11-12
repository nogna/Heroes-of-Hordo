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
    Item[] items;
    static int total_number_items=0;
    
    
    public Inventory(){
        newInventory();
        
    }
    

    public Item[] updateInventory(Item new_item){
        System.out.println("Picked up: "+ new_item.item_name);
        total_number_items++;
        Item[] tmp_inventory = newInventory(total_number_items);
        for (int i = 0; i < items.length; i++) {
            tmp_inventory[i]=items[i];
        }
        tmp_inventory[total_number_items-1]=new_item;
        this.items= tmp_inventory;
        
        return tmp_inventory;
    }
            
    private void newInventory() {
    this.items=new Item[1];
    total_number_items++;
    items[0] = new Weapon("Knife");
    
    }
    
    public void printInventory(){
        System.out.println("Inventory: ");
        for (int i = 0; i < total_number_items; i++) {
            System.out.println((i+1)+ ": " +items[i].item_name);
        }
    }

    private Item[] newInventory(int number_items) {
        Item[] tmp_inventory = new Item[number_items];
        return tmp_inventory;
    }
    
}
