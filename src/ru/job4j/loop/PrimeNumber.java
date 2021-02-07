package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int fin) {
        int count = 0;
        for (int i = 0; i <= fin; i++) {
            if (CheckPrimeNumber.check(i)) {
                count++;
            }
        }
        return count;
    }
}
