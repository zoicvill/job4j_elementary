package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] i = new int[5];
        for (int j = 0; j < i.length; j++) {
            i[j] = j * 2 + 3;
        }
        for (int s : i) {
            System.out.println(s);
        }
    }
}
