package by.epam.java_introduction.algoritmization;
/*
 Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class DecompTask2 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int gcdABCD;

        a = DecompTask1.enter("Введите натуральное число a:");
        b = DecompTask1.enter("Введите натуральное число b:");
        c = DecompTask1.enter("Введите натуральное число c:");
        d = DecompTask1.enter("Введите натуральное число d:");

        gcdABCD = DecompTask1.gcd(DecompTask1.gcd(DecompTask1.gcd(a, b), c), d);

        System.out.printf("НОД(%d,%d,%d,%d)=%d", a, b, c, d, gcdABCD);
    }
}
