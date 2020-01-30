package by.epam.java_introduction.basic;

/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */

public class LineTask5 {
    public static void main(String[] args) {
        int t = 3600;
        int hour;
        int minute;
        int second;

        hour = t / 3600;
        minute = (t - hour * 3600) / 60;
        second = t - (hour * 3600 + minute * 60);

        System.out.println(hour + "ч " + minute + "мин " + second + "c.");
    }
}
