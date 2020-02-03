package by.epam.java_introduction.algoritmization;

/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class MultiArrayTask3 {
    public static void main(String[] args) {
        int n = 3;
        int[][] array = new int[n][n];
        int k = 2;
        int p = 0;
        MultiArrayTask1.fillArray(array);
        MultiArrayTask1.printArray(array);

        System.out.println("------------------");
        System.out.println("Строка №" + k);
        for(int i = 0; i < n; i++){
            System.out.print(array[k][i] + "\t");
        }
        System.out.println();

        System.out.println("Столбец №" + p);
        for(int i = 0; i < n; i++){
            System.out.println(array[i][p]);
        }

    }

}
