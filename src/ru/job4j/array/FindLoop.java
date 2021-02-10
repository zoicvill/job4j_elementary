package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int fin) {
        int res = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int i = start; i <= fin; i++) {
            if (data[i] == el) {
                res = i;
                break;
            }
        }
        return res;
    }
}
