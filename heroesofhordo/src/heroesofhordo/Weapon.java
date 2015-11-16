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

    static boolean equalStats(Weapon A, Weapon B) {
        if (A.item_level == B.item_level && A.dmg == B.dmg) {
            return true;
        }
        return false;
    }

    static boolean equalWeapon(Weapon A, Weapon B) {
        if (A.weapon_name==B.weapon_name) {
            return true;
        }
        return false;
    
    }
    
    int dmg;
    String weapon_name;

    public Weapon(String Weapon) {
        super(Weapon);
        this.weapon_name=Weapon;
        switch (Weapon){
            
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