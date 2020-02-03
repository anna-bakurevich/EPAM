package by.epam.java_introduction.algoritmization;
/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */
public class ArrayTask6 {
    public static void main(String[] args) {
        double[] array = {200000, 14.25555, 0.3333333, 14, 10101.10, 0, -12};
        double sum = 0;
        for (int i = 1; i < array.length; i++) {
            if (isPrimeNumber(i)) {
                sum += array[i];
            }
        }
        System.out.println("Сумма элементов с простыми индексами: " + sum);
    }

    public static boolean isPrimeNumber(int n) {
        for (int j = 2; j < Math.sqrt(n)+1; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}