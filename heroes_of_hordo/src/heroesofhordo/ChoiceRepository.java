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

            case ("Sandtopia entrance"):
                return setChoicesSandtopia();

            case ("WIN"):
                won();
                break;

            case ("LOST"):
                lost();
                break;

            case ("Sandtopia - Dark Alley"):
                return setChoicesSandtopia_DarkAlley();

        }
        String[] x = new String[0];
        return x;
    }


    private void won() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void lost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String[] setChoicesSandtopia() {
        String[] choices = new String[5];
        choices[0] = "1: Go inside";
        choices[1] = "2: Knock";
        choices[2] = "3: Yell at the door";
        choices[3] = "4: Search inventory";
        choices[4] = "5: Exit Game";
        return choices;
    }

    private String[] setChoicesSandtopia_DarkAlley() {
        String[] choices = new String[5];
        choices[0] = "1: Linger forward";
        choices[1] = "2: Go back outside";
        choices[2] = "3: Look around";
        choices[3] = "4: Search inventory";
        choices[4] = "5: Exit Game";
        return choices;
    }

    private String[] setChoicesMarketPlace() {
        String[] choices = new String[3];
        choices[0] = "1: Stroll around";
        choices[1] = "2: Drop your only coin in good luck fountain";
        choices[2] = "3: Exit Game";
        return choices;
    }

    private String[] setChoicesDeepInMarket() {
        String[] choices = new String[3];
        choices[0] = "1: Steal the item";
        choices[1] = "2: Keep trying to find the way";
        choices[2] = "3: Exit Game";
        return choices;
    }
    private String[] setChoicesHayStack() {
        String[] choices = new String[2];
        choices[0] = "1: Sleep in the Hay Stack";
        choices[1] = "2: Exit Game";
        return choices;
    }
    private String[] setChoicesJail() {
        String[] choices = new String[2];
        choices[0] = "1: Sleep in the jail cell";
        choices[1] = "2: Exit Game";
        return choices;
    }
    private String[] setChoicesMainStreet() {
        String[] choices = new String[4];
        choices[0] = "1: Look for a shortcut";
        choices[1] = "2: Continue on the slow path";
        choices[2] = "3: Go inside the bar";
        choices[3] = "4: Exit Game";
        return choices;
    }
    private String[] setChoicesBar() {
        String[] choices = new String[3];
        choices[0] = "1: Bet on Scorpion";
        choices[1] = "2: Bet on Snake";
        choices[2] = "3: Exit Game";
        return choices;
    }
    private String[] setChoicesShortcut_Underground() {
        String[] choices = new String[3];
        choices[0] = "1: Carefully move forward";
        choices[1] = "2: Pick up the pace";
        choices[2] = "3: Exit Game";
        return choices;
    }
    private String[] setChoicesSideStreet() {
        String[] choices = new String[3];
        choices[0] = "1: Ahh, I know the way from here";
        choices[1] = "2: Ask for the directions";
        choices[2] = "3: Exit Game";
        return choices;
    }
    private String[] setChoicesOutsideTower() {
        String[] choices = new String[4];
        choices[0] = "1: Bribe";
        choices[1] = "2: Threaten with tiny knife";
        choices[2] = "3: Try to fool the guards";
        choices[3] = "4: Exit Game";
        return choices;
    }

    void printChoices(String Location) {
        String[] tmpChoices = getChoices(Location);
        for (int i = 0; i < tmpChoices.length; i++) {
            System.out.println(tmpChoices[i]);
        }
    }

}
