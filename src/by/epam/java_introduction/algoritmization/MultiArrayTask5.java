package by.epam.java_introduction.algoritmization;

/*
 Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
  1 1 1 ... 1 1 1
  2 2 2 ... 2 2 0
  3 3 3 ... 3 0 0
  ...............
  n-1 n-1 ..0 0 0
  n 0 0 ... 0 0 0
*/
public class MultiArrayTask5 {
    public static void main(String[] args) {
        int n = 4;
        int m = n;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = i + 1;
            }
            m--;
        }
        MultiArrayTask1.printArray(array);
    }
}
