/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesofhordo;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author albin
 */
public class Game {

    int how_many_players;
    Player[] players;
    Item[] item;
    ChoiceRepository choices;
    String[] locations;

    public Game() {
        Setup(1);
        choices = new ChoiceRepository();
        locations = CreateLocations();
    }

    private static int HowManyPlayers() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("How many players? ");
        int tmpPlayers = Sc.nextInt();
        return tmpPlayers;
    }

    static public void turns(Player[] PlayerQueue) {
        if (PlayerQueue == null) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        for (int i = 0; i < 1; i++) {
            for (int j = PlayerQueue.length - 1; j > 0; j--) {
                Player temp = PlayerQueue[j];
                PlayerQueue[j] = PlayerQueue[j - 1];
                PlayerQueue[j - 1] = temp;
            }
        }
    }

    private Player[] CreatePlayers(int HowManyPlayers) {
        Player[] players = new Player[HowManyPlayers];
        for (int i = 0; i < HowManyPlayers; i++) {
            players[i] = new Player(i);
            System.out.println(players[i].getPlayer());

        }
        return players;
    }

    public Item NewItem(String new_item) {
        Item tmp_item = new Item(new_item);
        return tmp_item;
    }

    public void PrintPlayers() {
        System.out.println("All players:");
        for (int i = 0; i < Player.total_player_number; i++) {
            System.out.println("Player: " + (players[i].getPlayer() + 1));
        }
    }

    private void Setup() {
        how_many_players = HowManyPlayers();
        players = CreatePlayers(how_many_players);
        for (int i = 0; i < how_many_players; i++) {
            players[i].hero.setName();
            Scanner Sc = new Scanner(in);
            int Race = Sc.nextInt();
            players[i].hero.race = new Race(Race);
        }

    }

    private void Setup(int i) {
        how_many_players = i;
        players = CreatePlayers(i);
    }

    Player getActivePlayer() {
        return players[0];
    }

    
    private String[] CreateLocations() {
        String[] AllLocations = new String[6];
        AllLocations[0] = "Sandtopia";
        AllLocations[1] = "Sandtopia - Dark Alley";
        AllLocations[2] = "WIN";
        AllLocations[3] = "LOST";
        AllLocations[4] = "DEAD";
        AllLocations[5] = "INVENTORY";

        return AllLocations;
    }

}
