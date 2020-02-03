package by.epam.java_introduction.algoritmization;

import java.util.Arrays;

/*
 Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
 (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
public class ArrayTask10 {
    public static void main(String[] args) {
        int[] a = {15, 15, -1, -1, 15, -15, -1};
        for (int i = 1; i < a.length; i = i + 2) {
            a[i] = 0;
        }
        System.out.println("Итоговый массив: " + Arrays.toString(a));
    }
}
