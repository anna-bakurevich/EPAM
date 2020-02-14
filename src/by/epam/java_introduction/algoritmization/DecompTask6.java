package by.epam.java_introduction.algoritmization;

/*
 Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class DecompTask6 {
    public static void main(String[] args) {
        int a = 12;
        int b = 9;
        int c = 27  ;

        if (isSimpleThree(a, b, c)) {
            System.out.printf("Числа %d, %d, %d являются взаимно простыми.", a, b, c);
        } else {
            System.out.printf("Числа %d, %d, %d не являются взаимно простыми.", a, b, c);
        }
    }

    //числа являются взаимно простыми, если их НОД равен 1
    public static boolean isSimpleThree(int a, int b, int c) {
        return DecompTask1.gcd(DecompTask1.gcd(a, b), c) == 1;
    }
}
