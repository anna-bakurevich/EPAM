package by.epam.java_introduction.basic;

/*
Вычислить значения функции на отрезке [а,b] c шагом h.
 */
public class LoopTask2 {
    public static void main(String[] args) {
        int a = -5;
        int b = 5;
        int h = 2;
        int y;

        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = -i;
            }
            System.out.println("y = " + y + " при x = " + i);
        }
    }
}
