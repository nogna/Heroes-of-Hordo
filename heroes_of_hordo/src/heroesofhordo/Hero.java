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

    static boolean equalChoice(Choice A, String[] B) {
        for (int i = 0; i < A.choices.length; i++) {
            if (A.choices[i] != B[i]) {
               return false; 
            }
            
            
        }
        return true;
    }
    
    String name, location, action;
    Race race;
    Choice choice;
    Inventory inventory;
    // Gear gear; //Later feature
    Weapon righthand;
    
    private int number_races=2;
    
    public Hero(){
        name="";
        location = "Sandtopia";
        inventory = new Inventory();
        action = "";
        choice=new Choice();
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
        System.out.print("Choose between 1-" + number_races+": ");  
        while (!sc.hasNextInt()) {
            System.out.println("That's not a number!");
            sc.next(); 
        }
            tmp_race = sc.nextInt();
    } while (tmp_race <= 0);
       
        race=new Race(tmp_race);
        System.out.println("You chose: "+ race.race_name);
    }
    
    public void setRace(int i) {
     race=new Race(i);
    }


    public void setChoices() {
            this.choice = new Choice(location);

    
    }
    
    public String getLocation(){
        return location;
    }

    public String getAction() {
        return action;
    }

    void getChoices() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
