package ru.job4j.loop;

public class Factorial {
    public static int calk(int i) {
        int result = 1;
            for (int j = 1; j <= i; j++) {
                result = result * j;
            }

        return result;
    }
}
