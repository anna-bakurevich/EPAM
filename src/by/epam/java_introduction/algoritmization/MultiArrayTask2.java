package by.epam.java_introduction.algoritmization;

/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class MultiArrayTask2 {
    public static void main(String[] args) {
        int n = 9;
        int[][] array = new int[n][n];
        MultiArrayTask1.fillArray(array);
        MultiArrayTask1.printArray(array);

        System.out.println("Диагональ 1");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i][i] + "\t");
        }

        System.out.println("\nДиагональ 2");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i][n-1-i] + "\t");
        }
    }
}
