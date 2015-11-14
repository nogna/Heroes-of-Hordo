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
        boolean Cont = true;
        System.out.println("Welcome to Heroes of Hordo!");
        Game game = new Game();
        while (Cont) {
            game.PrintPlayers();
            //game.turns(game.players);    
            game.players[0].hero.action = getPlayerAction(game.players[0]);
            System.out.println(game.players[0].hero.location);
            game.players[0].hero.location = ActivePlayerAction(game.players[0].hero.action);
            System.out.println(game.players[0].hero.location);
            
            //Cont = askContinue();
        }
    }

    private static String getPlayerAction(Player ActivePlayer) {
        int tmpAction;
        String[] tmpChoices = ActivePlayer.getHero().choice.getChoices();
        ActivePlayer.hero.choice.printChoices();
        System.out.println("Choose between 1-" + tmpChoices.length + ": ");
        System.out.println("Pick a action: ");
        Scanner sc = new Scanner(System.in);
        do {
            CheckIfInt(sc, tmpChoices);
            tmpAction = sc.nextInt();
        } while (validInt(tmpAction, tmpChoices));
        return tmpChoices[tmpAction - 1];
    }

    private static String ActivePlayerAction(String Action) {
        switch (Action) {
            case "Go inside":
                System.out.println("The doors makes a small noise when you open the door.");
                return "Sandtopia - Dark Alley";
            case "Knock":
                System.out.println("Knock...Knock...Knock");
                break;
            case "Yell at the door":
                System.out.println("No one seems to care.");
                break;
            case "Search inventory":
                return "INVENTORY";

        }
        return "";
    }

    private static boolean askContinue() {
        System.out.println("Exit Game?: (y/n)");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextLine().charAt(0)) {
            case 'y':
                return false;
        }

        return true;
    }

    private static void CheckIfInt(Scanner Input, String[] Choice) {
        while (!Input.hasNextInt()) {
            System.out.print("Plz a number between 1-" + Choice.length + ": ");
            Input.next();
        }
    }

    private static boolean validInt(int Action, String[] Choice) {
        return (Action <= 1 && Action >= Choice.length);
    }

}
