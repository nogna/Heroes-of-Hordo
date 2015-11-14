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

    String[] choices;

    public Choice() {
        this.choices = new String[5];
        setChoices("Sandtopia");
    }

    public void setChoices(String Location) {

        switch (Location) {

            case ("Sandtopia"):
                setChoicesSandtopia();
                break;
            case ("WIN"):
                won();
                break;

            case ("DEAD"):
                dead();
                break;

            case ("Sandtopia - Dark Alley"):
                setChoicesSandtopia_DarkAlley();
                break;

        }
    }

    void printChoices() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Action " + (i + 1) + ": " + choices[i]);
        }

    }

    String[] getChoices() {
        return choices;
    }

    private void setChoicesSandtopia() {
        this.choices[0] = "Go inside";
        this.choices[1] = "Knock";
        this.choices[2] = "Yell at the door";
        this.choices[3] = "Search inventory";
        this.choices[4] = "Exit Game";
    }

    private void won() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void dead() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setChoicesSandtopia_DarkAlley() {
        this.choices[0] = "Linger forward";
        this.choices[1] = "Go back outside";
        this.choices[2] = "Look around";
        this.choices[3] = "Search inventory";
        this.choices[4] = "Exit Game";
    }

}
