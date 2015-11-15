/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesofhordo;

import java.util.Arrays;
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
            Player activePlayer = game.getActivePlayer();
            activePlayer.action = getPlayerAction(game, activePlayer);
            ActivePlayerAction(activePlayer.action);
            System.out.println(activePlayer.location, activePlayer);
            game.turns(game.players);
            //Cont = askContinue();
        }
    }

    private static String getPlayerAction(Game game, Player ActivePlayer) {
        int tmpAction;
        String[] ActivePlayerChoices = game.choices.getChoices(ActivePlayer.location);
        printActivePlayerChoices(ActivePlayerChoices);
        Scanner Sc = new Scanner(System.in);
        do {
            CheckIfInt(Sc, ActivePlayerChoices);
            tmpAction = Sc.nextInt();
        } while (validInt(tmpAction, ActivePlayerChoices));
        System.out.println(ActivePlayerChoices[tmpAction - 1]);
        return ActivePlayerChoices[tmpAction - 1];
    }

    private static void ActivePlayerAction(Player ActivePlayer) {
        switch (ActivePlayer.action) {
            case "1: Go inside":
                System.out.println("The doors makes a small noise when you open the door.");
                ActivePlayer.location = "Sandtopia - Dark Alley";
            case "2: Knock":
                System.out.println("Knock...Knock...Knock");
                break;
            case "3: Yell at the door":
                System.out.println("No one seems to care.");
                break;
            case "4: Search inventory":
                return "INVENTORY";
            case "5: Exit Game":
                return "";

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

    private static void CheckIfInt(Scanner Input, String[] Choices) {
        while (!Input.hasNextInt()) {
            System.out.print("Plz a number between 1-" + Choices.length + ": ");
            Input.next();
        }
    }

    private static boolean validInt(int Action, String[] Choices) {
        return (Action <= 1 && Action >= Choices.length);
    }

    private static void printActivePlayerChoices(String[] ActivePlayerChoices) {
        Arrays.asList(ActivePlayerChoices).stream().forEach(choices -> System.out.println(choices));
        System.out.println("Choose between 1-" + ActivePlayerChoices.length);
        System.out.println("Pick a action: ");
    }

}
