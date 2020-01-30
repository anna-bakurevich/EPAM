package by.epam.java_introduction.basic;

/*
 Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */
public class BrunchTask3 {
    public static void main(String[] args) {
        double x1 = 0;
        double y1 = 0;
        double x2 = 1.5;
        double y2 = 1.5;
        double x3 = -2;
        double y3 = -2;

        //три точки принадлежат одной прямой, если (x1 - x3)(y2 - y3) = (x2 - x3)(y1 - y3)
        if ((x1 - x3) * (y2 - y3) == (x2 - x3) * (y1 - y3)) {
            System.out.printf("Точки A(%.2f; %.2f), B(%.2f; %.2f) и С(%.2f; %.2f) расположены на одной прямой.",
                    x1, y1, x2, y2, x3, y3);
        } else {
            System.out.printf("Точки A(%.2f; %.2f), B(%.2f; %.2f) и С(%.2f; %.2f) не принадлежат одной прямой.",
                    x1, y1, x2, y2, x3, y3);
        }
    }
}
