package by.epam.java_introduction.basic;

/*
 Найти max{min(a, b), min(c, d)}
 */

public class BrunchTask2 {
    public static void main(String[] args) {
        double a = 5;
        double b = 6;
        double c = 10;
        double d = 9;

        double minAB;
        double minCD;

        minAB = a < b ? a : b;
        minCD = c < d ? c : d;

        System.out.println("max{min(" + a + ", "  + b + "), min(" + c + ", " + d + ")} = " + (minAB > minCD ? minAB : minCD));

    }
}
