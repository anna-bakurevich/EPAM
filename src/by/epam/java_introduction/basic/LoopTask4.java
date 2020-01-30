package by.epam.java_introduction.basic;

import java.math.BigInteger;

/*
Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
public class LoopTask4 {
    public static void main(String[] args) {
        int n = 200;
        BigInteger p = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            p = p.multiply(BigInteger.valueOf(i*i));
        }
        System.out.println("Произведение квадратов первых " + n + " чисел равнo " + p);
    }
}
