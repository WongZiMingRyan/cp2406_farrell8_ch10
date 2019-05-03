package Qn2;

import java.util.Scanner;

public class DemoCandles {
    public static void main(String[] args) {
        Candle NormalCandle = new Candle();
        ScentedCandle FancyCandle = new ScentedCandle();
        Scanner scan = new Scanner(System.in);

        NormalCandle.setHeight();
        NormalCandle.setColor();
        NormalCandle.setPrice();

        FancyCandle.setScent();

        System.out.println("The height of the candle is " + NormalCandle.getHeight() +
                " inches. The candle's color is " + NormalCandle.getColor() + ". The candle costs $" + NormalCandle.getPrice() +
                ". The candle has the scent of " + FancyCandle.getScent());
    }
}
