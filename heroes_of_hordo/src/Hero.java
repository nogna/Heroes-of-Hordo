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
    String name, location;
    Race race;
    Choice choice;
    Inventory inventory;
    Gear gear;
    
    private int number_races=2;
    public Hero(){
        setName();
        setRace();
        setChoices();
        location = "Sandtopia";
        inventory = new Inventory();
        gear= new Gear();
    }

    private void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Skriv in namnet på din hero: ");
        String tmp_name = sc.nextLine();
        name = tmp_name;  
    }

    private void setRace() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Välj vilken class du vill vara?");  
        System.out.print("Välj mellan 1-" + number_races+":");  
        int tmp_race = sc.nextInt();
            race=new Race(tmp_race);
        
                
        
        
        
    }

    private void setChoices() {
        if (location !=null) {
            this.choice = new Choice(location);
        }else{
            this.choice = new Choice();
        }
    
    }
    
    
}
