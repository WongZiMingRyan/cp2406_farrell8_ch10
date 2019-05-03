package Qn1;

import javax.swing.*;

public class RaceHorse extends Horse {
    String racesDone;

    public String getRacesDone() {
        return racesDone;
    }
    public void setRacesDone() {
        racesDone = JOptionPane.showInputDialog(null,"How many races has the horse done: ");
        this.racesDone = racesDone;
    }
}
