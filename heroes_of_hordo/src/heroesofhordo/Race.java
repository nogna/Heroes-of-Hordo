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

    static boolean equalRace(Race A, Race B) {
        if (A.race_name == B.race_name) {
            return true;
        }
        return false;
    }

    static boolean equalStats(Race A, Race B) {
        if (A.agility == B.agility && A.strength == B.strength && A.wisdom == B.wisdom) {
            return true;
        }
        return false;
    }

    String race_name;
    int strength, wisdom, agility;

    public Race(int Race) {
        this.race_name = setRace(Race);
    }

    private String setRace(int race) {
        switch (race) {
            case 1:
                this.strength = 30;
                this.wisdom = 10;
                this.agility = 10;
                return "Opopilopop";
            case 2:
                this.strength = 10;
                this.wisdom = 30;
                this.agility = 10;
                return "Kraxlax";

        }
        return "";
    }
}
