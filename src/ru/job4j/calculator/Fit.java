package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = Fit.manWeight(height);
        System.out.println("Ideal weight for men with a height of 180 cm " + man + " kg");
        System.out.println("Ideal weight for women who are 180 cm tall " + Fit.womanWeight(height) + " kg");
    }
}
