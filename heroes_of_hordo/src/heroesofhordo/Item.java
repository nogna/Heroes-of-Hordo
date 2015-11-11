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
       makeItem(component);
    }

    private void makeItem(String component) {
    switch (component){
        case "helm":
            this.item_name=component;
            this.item_level = 10;
        case "turso":
            this.item_name=component;
            this.item_level = 10;
        case "pants":
            this.item_name=component;
            this.item_level = 10;
        case "boots":
            this.item_name=component;
            this.item_level = 10;
    }
    }
    
}
