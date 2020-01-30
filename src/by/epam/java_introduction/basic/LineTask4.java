package by.epam.java_introduction.basic;

/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class LineTask4 {
    public static void main(String[] args) {
        double r = 333.999;
        double result;
        result = (int) r * 0.001 + (int)((r - (int) r) * 1000);
        System.out.println(result);
    }
}