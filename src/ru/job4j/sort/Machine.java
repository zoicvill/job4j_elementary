package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {50, 10, 5, 2, 1};
        int[] rsl = new int[10];
        int x = 0;
        int size = money - price;
        for (int coin : coins) {
            while (size - coin >= 0) {
                size = size - coin;
                rsl[x] = coin;
                x++;
            }
        }
        return Arrays.copyOf(rsl, x);
    }
}
