package by.epam.java_introduction.basic;

/*
 Вычислить значение выражения по формуле (все переменные принимают действительные значения).
 */
public class LineTask2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 1;
        double c = 1;
        double result;

        result = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Значение выражения при a=" + a + ", b=" + b + ", c=" + c + " равно " + result);
    }
}