package by.epam.java_introduction.algoritmization;

import java.util.Arrays;
import java.util.Random;

/*
 Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class DecompTask5 {
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];

        enterArray(a);
        printArray(a);
        secondMax(a);
    }

    public static void enterArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }
    }

    public static void printArray(int[] array) {
        for (int e:array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void secondMax(int[] array) {
        Arrays.sort(array);
        if (array.length < 2) {
            System.out.println("В массиве один элемент: " + array[0]);
        } else {
            System.out.println("Второй по величине элемент массива: " + array[array.length - 2]);
        }
    }
}
