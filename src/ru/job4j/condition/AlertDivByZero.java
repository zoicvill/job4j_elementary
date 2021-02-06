package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        negativDiv(10);
        negativDiv(5);
        negativDiv(-5);
    }

    public static void negativDiv(int number) {
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }
}
