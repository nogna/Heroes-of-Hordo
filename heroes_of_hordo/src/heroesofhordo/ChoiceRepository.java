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
class ChoiceRepository {

    

    public String[] getChoices(String Location) {
        
        switch (Location) {

            case ("Sandtopia"):
                return setChoicesSandtopia();

            case ("WIN"):
                won();
                break;

            case ("DEAD"):
                dead();
                break;

            case ("Sandtopia - Dark Alley"):
                return setChoicesSandtopia_DarkAlley();

        }
        String[] x = new String[0];
        return x;
    }

    private String[] setChoicesSandtopia() {
        String[] choices = new String[5];
        choices[0] = "Go inside";
        choices[1] = "Knock";
        choices[2] = "Yell at the door";
        choices[3] = "Search inventory";
        choices[4] = "Exit Game";
        return choices;
    }

    private void won() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void dead() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String[] setChoicesSandtopia_DarkAlley() {
        String[] choices = new String[5];
        choices[0] = "Linger forward";
        choices[1] = "Go back outside";
        choices[2] = "Look around";
        choices[3] = "Search inventory";
        choices[4] = "Exit Game";
        return choices;
    }

    void printChoices(String Location) {
        String[] tmpChoices = getChoices(Location);
        for (int i = 0; i < tmpChoices.length; i++) {
            System.out.println(tmpChoices[i]);
        }
    }


 

    


}
