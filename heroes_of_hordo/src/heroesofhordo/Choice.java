/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesofhordo;

/**
 *
 * @author Nogna
 */
class Choice {
    String[] choice;
    
    public Choice(){
    this.choice = new String[5];
    setChoices("Sandtopia");
    }
    
    public Choice(String location) {
    setChoices(location);
    }

    private void setChoices(String location) {
    
    switch(location){
        
        case ("Sandtopia"):
        this.choice[0]="Go inside";
        this.choice[1]="Knock";
        this.choice[2]="Yell at the door";
        this.choice[3]="Search inventory";
        this.choice[4]="Exit Game";
        break;
        case ("WIN"):
        this.choice[0]="Victory Dance";
        this.choice[1]="No I want to play more";
        this.choice[2]="";
        this.choice[3]="";   
        break;
        
        case ("DEAD"):
        this.choice[0]="Search for Mr. Death";
        this.choice[1]="";
        this.choice[2]="";
        this.choice[3]="";   
        break;
    
        case ("Sandtopia - Dark Alley"):
        this.choice[0]="Linger forward";
        this.choice[1]="Go back outside";
        this.choice[2]="Look around";
        this.choice[3]="Search inventory";
        this.choice[4]="Exit Game";
        break;
    
    }
    }

    void printChoices() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Action "+(i+1)+": "+choice[i]);    
        }
        
    }
    
    String[] getChoices(){
        return choice;
    }
    
}
