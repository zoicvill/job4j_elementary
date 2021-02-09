package ru.job4j.array;

public class ReverseLoopArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < num.length; i++) {
            if (num[num.length - 1 - i] % 2 == 0) {
                System.out.println("Четные элементы массива " + num[num.length - 1 - i]);
            }
        }
    }
}
