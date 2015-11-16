/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesofhordo;

import java.util.Arrays;
import java.util.Random;
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
            System.out.println("Player " + (activePlayer.player_number + 1) + " you are located: " + activePlayer.location);
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
            //Sandtopia entrance LOCATION
            case "1: Go inside":
                System.out.println("The doors makes a small noise when you open the door.");
                if (ActivePlayer.location == "Sandtopia entrance") {
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
                //If no item want to be selected FIX
                break;
            case "5: Exit Game":
                //askContinue();
                break;
            //Sandtopia - Dark Alley LOCATION
            case "1: Linger forward":
                movePlayer(ActivePlayer, "Market Place");
                break;
            case "2: Look around":
                System.out.println("You find a small gold coin");
                Item SmallGoldCoin = new Item("Small gold coin");
                ActivePlayer.hero.inventory.addItemInventory(SmallGoldCoin);
                break;
            case "3: Search inventory":
                movePlayer(ActivePlayer, "INVENTORY");
                selectItem(ActivePlayer); //If no item want to be selected FIX
            case "4: Exit Game":
                //askContinue();
                break;
            //Market Place
            case "1: Stroll around":
                System.out.println("You stroll deeper and deeper into the market...");
                movePlayer(ActivePlayer, "Deep in Market");
                break;
            case "2: Drop your only coin in good luck fountain":
                System.out.println("You here a small splash when your coin hits the water");
                ActivePlayer.hero.luck = 20;
                ActivePlayer.hero.inventory.items = ActivePlayer.hero.inventory.deleteItemInventory("Small gold coin");
            case "3: Exit Game":
                break;
            //Deep in Market 
            case "1: Try steal the item":
                System.out.println("SHOOOOOPLIFTER!!! yells the shop owner");
                System.out.println("You quickly try to flee");
                if (tryAction(ActivePlayer.hero.luck)) {
                    System.out.println("You quickly find your way out of the market and jumps into at hay stack");
                    System.out.println("Without anyone noticing you");
                    ActivePlayer.hero.inventory.addItemInventory(new Item("Hookah"));
                    movePlayer(ActivePlayer, "Hay Stack");
                } else {
                    System.out.println("You quickly turn around and is about to run when you feel a giant hand on your shoulder");
                    System.out.println("You're caught...");
                    movePlayer(ActivePlayer, "Jail");
                }
            case "2: Ask for the way":
                System.out.println("The shop owner simple just sigh at you");
                break;
            //Hay Stack
            case "1: Wait in the Hay Stack":
                System.out.println("You wait for everything to calm down...");
                System.out.println("It seems like forever but when everthing "
                        + "start to settle you silently sneak out to the Main Street.");
                movePlayer(ActivePlayer, "Main Street");
                break;
            case "2: Exit game":
                break;
            // JAIL
            case "1: Wait in the jail cell":
                System.out.println("Hours and hours pass...");
                System.out.println("Not to get bored out of your mind, you find some enjoyment");
                System.out.println(" from watching the guards stroll around the dungeon.");
                System.out.println("But before you know it, a guard come and release you.");
                movePlayer(ActivePlayer, "Main Street");
                ActivePlayer.hero.jail = 1;
            //MAIN STREET
            case "1: Take the shortcut":
                System.out.println("You know that you can reach the house quicker if you go in the dungeons below the city.");
                System.out.println("But the dungeon is filled with tunnels but how hard could it be finding the way?");
                movePlayer(ActivePlayer, "Shortcut - Underground");
            case "2: Continue on the slow path":
                System.out.println("You slowly moving forward");
                movePlayer(ActivePlayer, "Side Street");
            case "3: Go inside the Bar":
                movePlayer(ActivePlayer, "Bar");
            //BAR
            case "1: Bet on Scorpion":
                if (tryAction(ActivePlayer.hero.luck)) {
                    System.out.println("Giant Pincer is the winner");
                    System.out.println("Yey Scorpion");
                    Item BigSackofCoins = new Item("Big sack of coins");
                    ActivePlayer.hero.inventory.addItemInventory(BigSackofCoins);
                }

                break;
            case "2: Bet on Snake":
                System.out.println("Giant Snake is the winner");
                System.out.println("Yey Snake");
                Item BigSackofCoins = new Item("Big sack of coins");
                ActivePlayer.hero.inventory.addItemInventory(BigSackofCoins);
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

    /* 
    Unnessesery prob selectItem function, LATER FETURE
     */
    private static void selectItem(Player ActivePlayer) {
        int ItemIndex = getPlayerInt(ActivePlayer.hero.inventory.getTotalNumberItems());
        ActivePlayer.hero.inventory.printInventory();
        Item activeItem = ActivePlayer.hero.inventory.getItem(ItemIndex);
        ActivePlayer.hero.righthand = activeItem;

    }

    private static int getPlayerInt(int Length) {
        Scanner Sc = new Scanner(System.in);
        int tmpInt;
        do {
            CheckIfInt(Sc, Length);
            tmpInt = Sc.nextInt();
        } while (validInt(tmpInt, Length));
        return tmpInt;
    }

    private static boolean tryAction(int Luck) {
        Random rand = new Random();
        int chance = (rand.nextInt(50) + 1) + Luck;
        if (chance >= 50) {
            return true;
        }
        return false;
    }

    private static boolean tryAction(int Luck, int Jail) {
        int Chance;
        Random rand = new Random();
        if (Jail == 1) {
            Chance = (rand.nextInt(80) + 1) + Luck;
            if (Chance >= 50) {
                return true;
            }
            return false;
        } else {

            Chance = (rand.nextInt(50) + 1) + Luck;
            if (Chance >= 50) {
                return true;
            }
            return false;
        }

    }
}
/*
SHORTCUT UNDERGROUND
if (tryAction(ActivePlayer.hero.luck, ActivePlayer.hero.jail)) {
                    System.out.println("All that time in the jail cell payed off!");
                    System.out.println("You managed to sneak around in the dungeon and ended up outside the tower");
                    movePlayer(ActivePlayer, "Outside Tower");
                }
                else{
                    System.out.println("Hey you there!");
                    System.out.println("You freeze, knowing you shouldn't be down here");
                    System.out.println("You get escorted by the guard that found you to a side street");
                    movePlayer(ActivePlayer, "Side Street");
                }
 */
