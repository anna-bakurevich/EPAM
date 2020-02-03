package by.epam.java_introduction.algoritmization;

/*
Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */
public class ArrayTask3 {
    public static void main(String[] args) {
        double[] array = {-5, 14.25555, 0.3333333, 0, 1010101010.10, 0, -12};
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPositive++;
            } else if (array[i] < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }

        System.out.printf("Отрицательных элементов: %d, положительных: %d, нулевых: %d",
                countNegative, countPositive, countZero);

    }
}