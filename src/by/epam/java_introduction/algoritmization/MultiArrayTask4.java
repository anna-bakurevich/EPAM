package by.epam.java_introduction.algoritmization;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
1  2   3  ... n
n n-1 n-2 ... 1
1  2   3  ... n
n n-1 n-2 ... 1
...............
n n-1 n-2 ... 1
 */
public class MultiArrayTask4 {
    public static void main(String[] args) {
        int n = 4;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    array[i][j] = j + 1;
                } else {
                    array[i][j] = n - j;
                }
            }
        }
        MultiArrayTask1.printArray(array);
    }

}
