package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (result == data[i])
                result = true;
            else result = false;
        }
        return result;
    }
}
