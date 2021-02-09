package ru.job4j.ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Petr Arsentev1";
        names[2] = "Petr Arsentev2";
        names[3] = "Petr Arsentev3";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
