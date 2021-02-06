package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = 0;
        if (first > second && first > third) {
            result = first;
        } else if (second > third) {
            result = third;
        } else result = third;

        return result;
    }
//return first > second && first > third ? first : second > third ? second : third;
}
