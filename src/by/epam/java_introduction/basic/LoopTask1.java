package by.epam.java_introduction.basic;

/*
 Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа
 от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class LoopTask1 {
    public static void main(String[] args) {
        System.out.println("Введите положительное целое число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);

        } else {
            System.out.println("Число " + n + " не является целым положительным числом.");
        }

    }
}
