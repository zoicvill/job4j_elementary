package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;

        int euro = Converter.rubleToEuro(140);

        System.out.println("140 rubles are " + euro + " euro. " + passed);
        System.out.println("180 rubles are " + Converter.rubleToDollar(180) + " dollar. " + passed);
    }
}
