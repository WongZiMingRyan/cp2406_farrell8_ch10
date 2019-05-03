package Qn4;

public class DemoPoems {
    public static void main(String[] args) {
        Poem billAndAlice = new Poem("Bill and Alive",10);
        billAndAlice.display();
        Haiku beep = new Haiku("Beep");
        beep.display();
        Limerick boop = new Limerick("Boop");
        boop.display();
        Couplet baap = new Couplet("Baap");
        baap.display();
    }
}