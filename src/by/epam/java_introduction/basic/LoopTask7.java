package by.epam.java_introduction.basic;

import java.util.Scanner;

/*
Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */
public class LoopTask7 {
    public static void main(String[] args) {
        int m;
        int n;

        m = valid("Введите натуральное число m");
        n = valid("Введите натуральное число n > m");

        if (n > m) {
            for (int i = m; i <= n; i++) {
                for (int j = m + 1; j < n; j++) {
                    if (i % j == 0 && i != j){
                        System.out.println("Делитель числа " + i + ": " + j);
                    }
                }
            }
        } else {
            System.out.println("Число " + n + " <= " + m);
        }
    }

    public static int valid(String message) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Введенные данные не являются натуральным числом, повторите ввод");
        }
        return sc.nextInt();
    }
}
