package ru.job4j.condition;

public class Cinema {
    public static void permission(boolean age, boolean money) {
        if (age && money) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);

    }
}
