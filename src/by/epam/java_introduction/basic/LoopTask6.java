package by.epam.java_introduction.basic;

/*
 Вывести на экран соответствие между символами и их численными обозначениями в памяти компьютера.
 */

public class LoopTask6 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Cимвол " + (char)i + ", код " + i);
        }
    }
}
