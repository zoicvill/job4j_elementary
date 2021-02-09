package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] i = new int[5];
        for (int j = 0; j <= i.length-1; j++) {
            i[j] = j * 2 + 3;
            System.out.println(i[j]);
        }
    }
}
