package by.epam.java_introduction.algoritmization;

/*
Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
public class ArrayTask5 {
    public static void main(String[] args) {
        int[] a = {1, 3, 0, 1111, 2};
        for (int i = 0; i < a.length; i++) {
            if (a[i] > i) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
