package by.epam.java_introduction.algoritmization;

/*
 Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 */
public class DecompTask3 {
    public static void main(String[] args) {
        int a = 5;
        System.out.printf("Площадь правильного шестиугольника со стороной %d равна %.2f", a, 6 * areaTriangle(a));
    }

    public static double areaTriangle(int a) {
        return (Math.sqrt(3) / 4) * (a * a);
    }
}
