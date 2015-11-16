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

    static boolean equal(Item A, Item B) {
    if (A.item_name ==B.item_name && A.item_level == B.item_level){
        return true;
    }else{
        return false;
    }
    }
    static boolean equal(Item A, String B) {
    if (A.item_name ==B){
        return true;
    }else{
        return false;
    }
    }

    String item_name;
    int item_level;
    

    Item(String Component) {
       this.item_name = Component;
       this.item_level = 1;
    }
    Item(String Component, int i) {
       this.item_name = Component;
       this.item_level = i;
    }

    
}
