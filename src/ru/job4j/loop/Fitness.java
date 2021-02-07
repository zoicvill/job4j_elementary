package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            month += 1;
            ivan *= 3;
            nik *= 2;

        }
        System.out.println("Тяга Ивана " + ivan + " Тяга Николая " + nik);
        return month;
    }
}
