package by.epam.java_introduction.basic;

/*
Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

public class LineTask1 {
    public static void main(String[] args) {
        double a = 5;
        double b = 4;
        double c = 1;
        double z;

        z = ((a - 3) * b / 2) + c;
        System.out.println("Значение функции z=((a – 3)*b/2) + c при a=" + a + ", b=" + b + ", c=" + c + " равно " + z);
    }
}
