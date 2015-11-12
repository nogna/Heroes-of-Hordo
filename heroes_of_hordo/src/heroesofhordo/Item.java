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
    String item_name;
    int item_level;
    

    Item(String component) {
       item_name = makeItem(component);
    }

    private String makeItem(String component) {
    this.item_level = 1;
    return component;
    }
    
}
