package by.epam.java_introduction.basic;

/*
 Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class LoopTask8 {
    public static void main(String[] args) throws Exception {
        int a = -345;
        int b = 46753;

        int absA = Math.abs(a);
        int absB = Math.abs(b);

        while (absA > 0) {
            int cA = absA % 10;
            absA /= 10;
            while (absB > 0) {
                if ((absB % 10) == cA) {
                    System.out.println("Цифра " + cA + " есть в обоих числах");
                }
                absB /= 10;
            }
            absB = Math.abs(b);
        }
    }
}