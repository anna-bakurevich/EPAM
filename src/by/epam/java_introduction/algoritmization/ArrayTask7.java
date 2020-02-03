package by.epam.java_introduction.algoritmization;

/*
Даны действительные числа a(1), a(2), ..., a(2n) . Найти max(a(1)+a(2n), a(2)+a(2n-1), ...,a(n)+a(n+1)).
 */
public class ArrayTask7 {
    public static void main(String[] args) {
        double[] a = {100, 450, 10, 15, -3, 0};
        int n = a.length - 1;
        double sum = a[0] + a[n];
        double max = sum;
        for (int i = 1; i < n / 2 + 1; i++) {
            sum = a[i] + a[n - i];
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}