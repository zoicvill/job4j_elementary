package ru.job4j.condition;

public class SwitchWeek {

    public static String nameOfDays(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресенье";
                break;
            default:
                name = "Error";
                break;
        }
        return name;
    }

    public static void main(String[] args) {

        String pon = SwitchWeek.nameOfDays(1);
        System.out.println(pon);
        String vt = SwitchWeek.nameOfDays(2);
        System.out.println(vt);
        String sr = SwitchWeek.nameOfDays(3);
        System.out.println(sr);
        String cht = SwitchWeek.nameOfDays(4);
        System.out.println(cht);
        String pt = SwitchWeek.nameOfDays(5);
        System.out.println(pt);
        String sb = SwitchWeek.nameOfDays(6);
        System.out.println(sb);
        String vs = SwitchWeek.nameOfDays(7);
        System.out.println(vs);
        String def = SwitchWeek.nameOfDays(8);
        System.out.println(def);
    }
}
