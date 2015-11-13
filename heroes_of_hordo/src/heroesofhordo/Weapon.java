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

    static boolean equalStats(Weapon a, Weapon b) {
        if (a.item_level == b.item_level && a.dmg == b.dmg) {
            return true;
        }
        return false;
    }

    static boolean equalWeapon(Weapon a, Weapon b) {
        if (a.weapon_name==b.weapon_name) {
            return true;
        }
        return false;
    
    }
    
    int dmg;
    String weapon_name;

    public Weapon(String weapon) {
        super(weapon);
        this.weapon_name=weapon;
        switch (weapon){
            
        case "Knife":
            this.item_level = 1;
            this.dmg = 10;
            break;
        case "Stick":
            this.item_level = 1;
            this.dmg = 1;
            break;
    
        }

    }


    public void upgradeDmg(int i) {
    this.dmg= this.dmg+i;
    }
}