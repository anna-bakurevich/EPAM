package by.epam.java_introduction.basic;

/*
 Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
 */
public class BrunchTask4 {
    public static void main(String[] args) {
        double a = 2;
        double b = 4;
        double x = 5;
        double y = 4;
        double z = 2;

        if ((a == x || a == y || a == z) && (b == x || b == y || b == z)) {
            System.out.printf("Кирпич с размерами %.2f, %.2f, %.2f пройдет в отверстие %.2f x %.2f", x, y, z, a, b);
        } else {
            System.out.printf("Кирпич с размерами %.2f, %.2f, %.2f не пройдет в отверстие %.2f x %.f", x, y, z, a, b);
        }
    }
}