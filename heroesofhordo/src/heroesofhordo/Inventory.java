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
   static int total_number_items;
   
    static boolean equal(Inventory Result, String[] B, int j) {
          for (int i = 0; i < j ; i++) {
            if (Result.items[i].item_name !=B[i]){
                return false;
            }
        }
        return true;
    }
 
    
    
    public Inventory(){
        total_number_items=0;
        newInventory();
        
    }
    

    public void updateInventory(Item newItem){
        System.out.println("Picked up: "+ newItem.item_name);
        total_number_items++;
        this.items = update(newItem);
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

    private Item[] newInventory(int NumerItems) {
        Item[] newInventory = new Item[NumerItems];
        return newInventory;
    }
    

    int getTotalNumberItems() {
    return total_number_items;
    }

    private Item[] update(Item newItem) {
        Item[] tmpInventory = newInventory(total_number_items);
        for (int i = 0; i < items.length; i++) {
            tmpInventory[i]=items[i];
        }
        tmpInventory[total_number_items-1]=newItem;
        
        
        return tmpInventory;
    }
    
}
