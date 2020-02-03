package by.epam.java_introduction.algoritmization;

import java.util.Random;

/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class MultiArrayTask1 {
    public static void main(String[] args) {
        int n = 5;
        int[][] array = new int[n][n];
        fillArray(array);
        printArray(array);

        for (int i = 1; i < n; i += 2) {
            if (array[0][i] > array[n - 1][i]) {
                System.out.println("Столбец №" + i);
                for (int j = 0; j < n; j++) {
                    System.out.println(array[j][i]);
                }
            }
        }
    }

    //заполнение массива случайными целыми числами в промежутке [0;9]
    public static void fillArray(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
    }

    //печать массива
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
