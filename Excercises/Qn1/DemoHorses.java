package Qn1;

import javax.swing.*;

public class DemoHorses {
    public static void main(String[] args){
        Horse FancyHorse = new Horse();
        RaceHorse SpeedyHorse = new RaceHorse();

        FancyHorse.setName();
        FancyHorse.setColor();
        FancyHorse.setBirthYear();

        SpeedyHorse.setRacesDone();

        JOptionPane.showMessageDialog(null,"The name of the horse is " + FancyHorse.getName() +
                ". The horse's color is " + FancyHorse.getColor()+ ". It was born in " + FancyHorse.getBirthYear() +
                ". " + FancyHorse.getName() + " has taken part in " + SpeedyHorse.getRacesDone() + " races");
    }
}
