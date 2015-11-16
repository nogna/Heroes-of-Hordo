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
class Player {

    public static int total_player_number = 0;
    int player_number;
    Hero hero;
    String action;
    String location = "Sandtopia entrance";
    
    public Player(int i) {
        total_player_number++;
        player_number = i;
        setHero();
    }

    int getTotalPlayerNumber() {
        return total_player_number;
    }

    int getPlayer() {
        return this.player_number;
    }

    Hero getHero() {
        return this.hero;
    }

    private void setHero() {
        if (hero != null) {

        } else {
            this.hero = new Hero();
        }
    }
    public String getAction() {
        return action;
    }

    public String[] getChoices(Game game) {
        
        return game.choices.getChoices(location);
    }

}
