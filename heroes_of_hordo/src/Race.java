/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesofhordo;

/**
 *
 * @author albin
 */
class Race {
    String race_name;
    int strength, wisdom, agility, luck;
    public Race(int race){
        switch (race){
            case 1:
                race_name = "Opopilopop";
                strength=50;
                wisdom = 30;
                agility = 70;
                luck = 20;
            case 2:
                race_name = "Bytrand";
                strength=30;
                wisdom = 50;
                agility = 70;
                luck = 20;
        }
    }
}
