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
    String choice1, choice2, choice3, choice4, choice5;
    
    public Choice(){
        this.choice1="Go inside";
        this.choice2="Knock";
        this.choice3="Yell at the door";
        this.choice4="Search inventory";
        this.choice5="Exit Game";
    }
    
    public Choice(String location) {
    setChoices(location);
    }

    private void setChoices(String location) {
    switch(location){
        case ("WIN"):
        this.choice1="Victory Dance";
        this.choice2="No I want to play more";
        this.choice3="";
        this.choice4="";   
        break;
        
        case ("DEAD"):
        this.choice1="Search for Mr. Death";
        this.choice2="";
        this.choice3="";
        this.choice4="";   
        break;
    
        case ("Sandtopia - Dark Alley"):
        this.choice1="Linger forward";
        this.choice2="Go back outside";
        this.choice3="Look around";
        break;
    
    }
    }

    String[] printAndreturnChoices() {
        String[] tmp_choices = new String[5];
        tmp_choices[0] = choice1;
        tmp_choices[1] = choice2;
        tmp_choices[2] = choice3;
        tmp_choices[3] = choice4;
        tmp_choices[4] = choice5;
        for (int i = 0; i < 4; i++) {
            System.out.println("Action "+(i+1)+": "+tmp_choices[i]);    
        }
        return tmp_choices;
    }
    
}
