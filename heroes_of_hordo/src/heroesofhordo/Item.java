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
class Item {

    static boolean equal(Item a, Item b) {
    if (a.item_name ==b.item_name && a.item_level == b.item_level){
        return true;
    }else{
        return false;
    }
    }



    
        
    

    String item_name;
    int item_level;
    

    Item(String component) {
       this.item_name = component;
       this.item_level = 1;
    }
    Item(String component, int i) {
       this.item_name = component;
       this.item_level = i;
    }

    
}
