package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double poluPerimeter = (a + b + c) / 2;
        return Math.sqrt(poluPerimeter * (poluPerimeter - a) * (poluPerimeter - b) * (poluPerimeter - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
