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

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите натуральное число m");
        m = valid(sc);

        System.out.println("Введите натуральное число n > m");
        n = valid(sc);

        if (n > m) {
            for (int i = m; i <= n; i++) {
                for (int j = m + 1; j < n; j++) {
                    if (i % j == 0) {
                        System.out.println("Делитель числа " + i + ": " + j);
                    }
                }
            }
        } else {
            System.out.println("Число " + n + " <= " + m);
        }
    }

    public static int valid(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Введенные данные не являются натуральным числом, повторите ввод");
        }
        return sc.nextInt();
    }
}
