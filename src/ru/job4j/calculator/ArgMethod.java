package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + " " + age + " yers.");
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 333;
        ArgMethod.hello(name, age);

    }
}
