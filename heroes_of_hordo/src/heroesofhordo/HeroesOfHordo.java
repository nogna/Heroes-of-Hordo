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
            System.out.println("Player "+ (activePlayer.player_number+1) +" you are located: "+ activePlayer.location);
            activePlayer.action = getPlayerAction(game, activePlayer);
            ActivePlayerAction(activePlayer);
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
            CheckIfInt(Sc, ActivePlayerChoices.length);
            tmpAction = Sc.nextInt();
        } while (validInt(tmpAction, ActivePlayerChoices.length));
        System.out.println(ActivePlayerChoices[tmpAction - 1]);
        return ActivePlayerChoices[tmpAction - 1];
    }

    private static void ActivePlayerAction(Player ActivePlayer) {
        switch (ActivePlayer.action) {
            case "1: Go inside":
                System.out.println("The doors makes a small noise when you open the door.");
                if (ActivePlayer.location == "Sandtopia") {
                    movePlayer(ActivePlayer, "Sandtopia - Dark Alley");
                }

            case "2: Knock":
                System.out.println("Knock...Knock...Knock");
                break;

            case "3: Yell at the door":
                System.out.println("No one seems to care.");
                break;

            case "4: Search inventory":
                movePlayer(ActivePlayer, "INVENTORY");
                selectItem(ActivePlayer);
                break;
            case "5: Exit Game":
                break;

            case "1: Linger forward":
                movePlayer(ActivePlayer, "Market Place");
                break;
            case "2: Go back outside":
                movePlayer(ActivePlayer, "Sandtopia");
                break;
        }
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

    private static void CheckIfInt(Scanner Input, int length) {
        while (!Input.hasNextInt()) {
            System.out.println("Plz a number between" + length + ": ");
            Input.next();
        }
    }

    private static boolean validInt(int Action, int length) {
        return (Action <= 1 && Action >= length);
    }

    private static void printActivePlayerChoices(String[] ActivePlayerChoices) {
        Arrays.asList(ActivePlayerChoices).stream().forEach(choices -> System.out.println(choices));
        System.out.println("Choose between 1-" + ActivePlayerChoices.length);
        System.out.println("Pick a action: ");
    }

    private static void movePlayer(Player ActivePlayer, String Location) {
        ActivePlayer.location = Location;
    }

    private static void selectItem(Player ActivePlayer) {
        int ItemIndex = getPlayerInt(ActivePlayer.hero.inventory.getTotalNumberItems());
        ActivePlayer.hero.inventory.printInventory();
        Item activeItem = ActivePlayer.hero.inventory.getItem(ItemIndex);
        ActivePlayer.hero.righthand = activeItem;

    }

    private static int getPlayerInt(int length) {
        Scanner Sc = new Scanner(System.in);
        int tmpInt;
        do {
            CheckIfInt(Sc, length);
            tmpInt = Sc.nextInt();
        } while (validInt(tmpInt, length));
        return tmpInt;
    }

}
