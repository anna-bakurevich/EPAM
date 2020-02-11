package by.epam.java_introduction.algoritmization;

import java.util.Scanner;

/*
Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:
НОК(a,b) = (a*b)/НОД(a,b)
 */
public class DecompTask1 {

    public static void main(String[] args) {
        int a;
        int b;
        int tmp;

        a = enter("Введите натуральное число a:");
        b = enter("Введите натуральное число b:");

        System.out.println(gcd(a, b));
        System.out.println("НОК(" + a + "," + b + ")=" + lcm(a, b));
    }

    public static int enter(String massage) {
        System.out.println(massage);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Введенные данные не являются натуральным числом. Повторите ввод:");
        }
        return scanner.nextInt();
    }

    //GSD (Greatest common divisor)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    //LCM (Least common multiple)
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
