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
        System.out.println("Välkomna till Heroes of Hordo!");
        Game game = new Game();
        turns(game.players, game.how_many_turns);

    }
    static private void turns(Player[] arr, int how_many_turns) {
	if (arr == null || how_many_turns < 0) {
	    throw new IllegalArgumentException("Illegal argument!");
	}
 
	for (int i = 0; i < how_many_turns; i++) {
		for (int j = arr.length - 1; j > 0; j--) {
			Player temp = arr[j];
			arr[j] = arr[j - 1];
			arr[j - 1] = temp;
		}
	}
}
    private static boolean askContinue() {
        System.out.println("Vill du avsluta?: (y/n)");
        Scanner sc2 = new Scanner(System.in);
        switch (sc2.nextLine().charAt(0)){
            case 'y':
                return false;
            }

                return true;
    }

}