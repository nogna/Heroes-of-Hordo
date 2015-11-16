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
public class Hero {

    static boolean equalChoice(String[] result, String[] expResult) {
        for (int i = 0; i < result.length; i++) {
            if (result[i] != expResult[i]) {
                return false;
            }

        }
        return true;
    }

    String name;
    Race race;
    Inventory inventory;
    // Gear gear; //Later feature
    Item righthand;
    int jail;

    private int number_races = 2;
    int luck;

    public Hero() {
        name = "";
        luck = 10;
        jail = 0;
        inventory = new Inventory();
        /*LATER FEATURE
        gear= new Gear();
         */
    }

    public void setName() {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Write your heros name: ");
        String tmpName = Sc.nextLine();
        name = tmpName;
    }

    public void setRace() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick race:");
        int tmp_race;
        do {
            System.out.print("Choose between 1-" + number_races + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            tmp_race = sc.nextInt();
        } while (tmp_race <= 0);

        race = new Race(tmp_race);
        System.out.println("You chose: " + race.race_name);
    }

    public void setRace(int i) {
        race = new Race(i);
    }

    /*
    public void setChoices() {
        String[] tmp_choices = new Choice(location);
        return tmp_choices;
    
    }*/
}
