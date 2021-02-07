package ru.job4j.loop;

public class Mortgage {
    public static int year(double sumD, double zp, double percent) {
        int year = 0;
        while (sumD > 0) {
            sumD += (sumD * (percent / 100));
            sumD -= zp;
            year++;
        }
        return year;
    }
}
