package by.epam.java_introduction.basic;

/*
Вычислить значение функции.
 */

public class BrunchTask5 {
    public static void main(String[] args) {
        double x = 0.1;
        double f;

        if (x <= 3) {
            f = x * x - 3 * x + 9;
        } else {
            f = 1/(x*x*x + 6);
        }
        System.out.println("Значение функции при x = " + x + " равно " + f);
    }
}