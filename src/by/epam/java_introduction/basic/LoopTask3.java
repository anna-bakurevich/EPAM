package by.epam.java_introduction.basic;
/*
 Найти сумму квадратов первых ста чисел.
 */

public class LoopTask3 {
    public static void main(String[] args) {
        int n = 100;
        int sum = 1;
        for (int i = 2; i <= n; i++) {
            sum += i * i;
        }
        System.out.println("Сумма квадратов первых " + n + " чисел равна " + sum);
    }
}
