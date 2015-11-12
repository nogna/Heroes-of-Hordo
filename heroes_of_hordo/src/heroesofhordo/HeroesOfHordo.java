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
        System.out.println("Welcome to Heroes of Hordo!");
        Game game = new Game();
        turns(game.players);
        makePlayerMove(game);
        
    }
    static private void turns(Player[] arr) {
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
        String[] tmp_choices = game.players[0].getHero().choice.printAndreturnChoices();
        Scanner sc = new Scanner(System.in);
        int tmp_action = sc.nextInt();
        game.players[0].hero.action=tmp_choices[tmp_action-1];}
        
        
        
}

