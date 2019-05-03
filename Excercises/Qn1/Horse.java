package Qn1;

import javax.swing.*;

public class Horse {
    String name, color, birthYear;

    public String getName() {

        return name;
    }
    public void setName() {
        name = JOptionPane.showInputDialog(null,"What is the Horse's name: ");
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    public void setColor() {
        color = JOptionPane.showInputDialog(null,"What color is the Horse: ");
        this.color = color;
    }

    public String getBirthYear() {
        return birthYear;
    }
    public void setBirthYear() {
        birthYear = JOptionPane.showInputDialog(null,"What year was the Horse born: ");
        this.birthYear = birthYear;
    }
}
