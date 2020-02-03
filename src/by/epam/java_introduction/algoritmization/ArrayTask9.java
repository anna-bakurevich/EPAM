package by.epam.java_introduction.algoritmization;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько,
то определить наименьшее из них.
 */
public class ArrayTask9 {
    public static void main(String[] args) {
        int[] a = {15, 16, -1, -2, 17, 18, 17};
        int frequency = 1;
        int number = a[0];
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    frequency++;
                    number = a[i];
                }
            }
        }
        if (frequency == 1) {
            System.out.println("Повторяющихся элементов в массиве нет");
        } else {
            System.out.println(number);
        }
    }
}
