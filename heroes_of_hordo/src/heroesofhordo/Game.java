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
    int how_many_players, how_many_turns;
    Player[] players;
    
    public Game(){
        setup(1);
        //TODO
        
    }
    
    
    private static int HowManyPlayers() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Välj hur många spelare: ");
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

    private void PrintPlayers() {
        for (int i = 0; i < Player.total_player_number; i++) {
            System.out.println("Spelare: "+ players[i].getPlayer());
        }
}

    private void setup() {
    how_many_players = HowManyPlayers();
    players = CreatePlayers(how_many_players);
    how_many_turns= HowManyTurns();
    }
    private void setup(int i) {
    how_many_players = HowManyPlayers(i);
    players = CreatePlayers(i);
    how_many_turns= HowManyTurns(i);
    }

    private int HowManyTurns() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Välj hur många turer: ");
    int tmp_how_many_turns = sc.nextInt();
    return tmp_how_many_turns;
    
    }

    private int HowManyTurns(int tmp_how_many_turns) {
    return tmp_how_many_turns;
    }

    
 
    }
