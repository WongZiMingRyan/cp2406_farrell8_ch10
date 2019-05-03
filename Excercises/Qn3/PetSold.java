package Qn3;

import java.util.Scanner;

public class PetSold extends ItemSold{
    boolean vaccinated, neutered, housebroken;
    Scanner scan = new Scanner(System.in);

    public Boolean getVaccinated() {
        return vaccinated;
    }
    public void setVaccinated() {
        System.out.println("Is it Vaccinated (true/false):");
        vaccinated = scan.nextBoolean();
    }

    public Boolean getNeutered() {
        return neutered;
    }
    public void setNeutered() {
        System.out.println("Is it Neutered (true/false):");
        neutered = scan.nextBoolean();
    }

    public Boolean getHousebroken() {
        return housebroken;
    }
    public void setHousebroken() {
        System.out.println("Is it Housebroken (true/false):");
        housebroken = scan.nextBoolean();
    }
}
