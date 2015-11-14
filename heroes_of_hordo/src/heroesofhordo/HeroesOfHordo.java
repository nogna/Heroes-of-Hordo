/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesofhordo;

import java.util.Scanner;

/**
 *
 * @author Albin Sundqvist
 */
public class HeroesOfHordo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean cont=true;
        System.out.println("Welcome to Heroes of Hordo!");
        Game game = new Game();
        while (cont){
            Player activePlayer = turns(game.players);
            makePlayerMove(game);
            activePlayerAction(activePlayer);
            
        
        
        cont = askContinue();
        }
        
        
        
    }
    
    static private Player turns(Player[] arr) {
	if (arr == null) {
	    throw new IllegalArgumentException("Illegal argument!");
	}
 
	for (int i = 0; i < 1; i++) {
		for (int j = arr.length - 1; j > 0; j--) {
			Player temp = arr[j];
			arr[j] = arr[j - 1];
			arr[j - 1] = temp;
		}
	}
        return arr[0];
}
    private static boolean askContinue() {
        System.out.println("Vill du avsluta?: (y/n)");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextLine().charAt(0)){
            case 'y':
                return false;
            }

                return true;
    }

    private static void makePlayerMove(Game game) {
        pickAction(game);
        
    }

    private static void pickAction(Game game) {
        System.out.println("Pick a action: ");
        String[] tmp_choices = game.players[0].getHero().choice.getChoices();
        Scanner sc = new Scanner(System.in);
        int tmp_action;
        do{
            while (!sc.hasNextInt()) {
            game.players[0].hero.choice.printChoices();
            System.out.println("Choose between 1-" + tmp_choices.length);
            sc.next(); 
        }
        tmp_action = sc.nextInt();
        } while (tmp_action <=0);
        game.players[0].hero.action=tmp_choices[tmp_action-1];
    }
    
    private static void activePlayerAction(Player activePlayer) {
                switch (activePlayer.hero.action) {
                case "Go inside":
                    System.out.println("The doors makes a small noise when you open the door.");
                    activePlayer.hero.location= "Sandtopia - Dark Alley";
                    break;
                case "Knock":
                    System.out.println("Knock...Knock...Knock");
                    break;
                case "Yell at the door":
                    System.out.println("No one seems to care.");
                    break;
                case "Search inventory":
                    activePlayer.hero.location= "INVENTORY";
                    break;
                    
                
            }
    }
        
        
        
}

