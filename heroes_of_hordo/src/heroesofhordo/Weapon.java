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
class Weapon extends Item {
    int dmg;
    String item_name;

    public Weapon(String weapon) {
        super(weapon);
        switch (weapon){
            
        case "Knife":
            this.item_name=weapon;
            this.item_level = 1;
            this.dmg = 10;
            
        case "Stick":
            this.item_name=weapon;
            this.item_level = 1;
            this.dmg = 10;
    
        }

    }
}