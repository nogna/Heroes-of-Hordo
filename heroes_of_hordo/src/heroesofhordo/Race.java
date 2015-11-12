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
        this.race_name=setRace(race);
    }

    private String setRace(int race) {
        switch (race){
        case 1:
            this.strength=50;
            this.wisdom = 30;
            this.agility = 70;
            this.luck = 20;
            return "Opopilopop";
        case 2:
            this.strength=30;
            this.wisdom = 50;
            this.agility = 70;
            this.luck = 20;
            return "Kraxlax";

        }
        return "";
    }
}

