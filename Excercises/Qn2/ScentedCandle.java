package Qn2;
import java.util.Scanner;

public class ScentedCandle extends Candle {
    String scent;
    Scanner scan = new Scanner(System.in);

    public String getScent() {
        return scent;
    }
    public void setScent() {
        System.out.println("What is the scent of the candle:");
        scent = scan.next();
    }
}
