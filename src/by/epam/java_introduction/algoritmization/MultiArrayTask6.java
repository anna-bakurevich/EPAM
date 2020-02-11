package by.epam.java_introduction.algoritmization;
/*
 Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 1 1 1 ... 1 1 1
 0 1 1 ... 1 1 0
 0 0 1 ... 1 0 0
 ...............
 0 1 1 ... 1 1 0
 1 1 1 ... 1 1 1
 */

public class MultiArrayTask6 {
    public static void main(String[] args) {
        int n = 10;
        int[][] array = new int[n][n];
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = i; j < n - i; j++) {
                array[i][j] = 1;
            }

        }
        for (int i = n / 2; i < n; i++) {
            for (int j = n - i - 1; j < i + 1; j++) {
                array[i][j] = 1;
            }
        }

        MultiArrayTask1.printArray(array);
    }
}
