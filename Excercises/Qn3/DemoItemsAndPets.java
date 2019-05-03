package Qn3;

public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold item = new ItemSold();
        PetSold pet = new PetSold();

        item.setInvoiceNum();
        item.setDescription();
        item.setPrice();

        pet.setVaccinated();
        pet.setNeutered();
        pet.setHousebroken();

        System.out.println("The invoice num is " + item.getInvoiceNum() +
                ". The description is: " + item.getDescription() + ". The price is $" + item.getPrice() +
                ". If item is a pet, is it Vaccinated/Neutered/Housebroken: "
                + pet.getVaccinated() + "/" + pet.getNeutered() + "/" + pet.getHousebroken());
    }
}
