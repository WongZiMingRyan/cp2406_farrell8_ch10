package Qn2;
import java.util.Scanner;

public class Candle {
    String color;
    int height, price;
    Scanner scan = new Scanner(System.in);

    public int getHeight() {
        return height;
    }
    public void setHeight() {
        System.out.println("What is the height of the candle(in inches):");
        height = scan.nextInt();
    }

    public String getColor() {
        return color;
    }
    public void setColor() {
        System.out.println("What is the color of the candle:");
        color = scan.next();
    }

    public int getPrice() {
        return price;
    }
    public void setPrice() {
        price = height * 2;
    }
}
