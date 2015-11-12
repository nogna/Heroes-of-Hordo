/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesofhordo;

import java.util.Scanner;

/**
 *
 * @author albin
 */
public class Game {
    int how_many_players;
    Player[] players;
    Item[] item;
    
    
    public Game(){
        setup(1);
        
    }
    
    
    private static int HowManyPlayers() {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many players? ");
    int tmp_players = sc.nextInt();
    return tmp_players;
    }
    private static int HowManyPlayers(int number_of_players) {

    return number_of_players;
    }
    
    
    
    private Player[] CreatePlayers(int how_many_players) {
        Player[] players = new Player[how_many_players];
        for (int i = 0; i < how_many_players; i++) {
            players[i]= new Player(i);
            System.out.println(players[i].getPlayer());
            
        }
        return players;
    }
    
    public Item newItem(String new_item){
        Item tmp_item = new Item(new_item);
        return tmp_item;
    }
    
    
    
    private void PrintPlayers() {
        for (int i = 0; i < Player.total_player_number; i++) {
            System.out.println("Player: "+ players[i].getPlayer());
        }
}
    private void setup() {
    how_many_players = HowManyPlayers();
    players = CreatePlayers(how_many_players);
    
    }
    private void setup(int i) {
    how_many_players = HowManyPlayers(i);
    players = CreatePlayers(i);
    }
 
    }
