package by.epam.java_introduction.basic;
/*
Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
то будет ли он прямоугольным.
 */

public class BrunchTask1 {
    public static void main(String[] args) {
        int angle1 = 30;
        int angle2 = 90;

        int sum;
        sum = angle1 + angle2;

        if (sum < 180) {
            System.out.println("Треугольник с углами " + angle1 + " и " + angle2 + " градусов существует.");
            if (angle1 == 90 || angle2 == 90 || 180 - sum == 90) {
                System.out.println("Треугольник прямоугольный.");
            }
        } else {
            System.out.println("Треугольника с углами " + angle1 + " и " + angle2 + " не существует.");
        }
    }
}

