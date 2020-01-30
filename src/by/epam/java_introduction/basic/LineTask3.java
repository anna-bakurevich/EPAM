package by.epam.java_introduction.basic;

/*
 Вычислить значение выражения по формуле (все переменные принимают действительные значения).
 */

public class LineTask3 {
    public static void main(String[] args) {
        double x = Math.PI/2;//90 градусов
        double y = Math.PI/3;//60 градусов
        double result;

        result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println("Значение выражения при x=" + x + ", y=" + y + " равно " + result);
    }
}