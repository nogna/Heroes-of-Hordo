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
    String choice1, choice2, choice3, choice4;
    
    public Choice(){
        this.choice1="Go inside";
        this.choice2="Knock";
        this.choice3="Yell";
        this.choice4="Search inventory";
    }
    
    public Choice(String location) {
    setChoices(location);
    }

    private void setChoices(String location) {
    switch(location){
        case "":
        this.choice1="Exit Game";
        this.choice2="No I want to play more";
        this.choice3="";
        this.choice4="";   
    
        case ("Sandtopia - Dark Alley"):
        this.choice1="Linger forward";
        this.choice2="Go back outside";
        this.choice3="Look around";
        this.choice4="Search inventory"; 
                
    
    }
    }
    
}
