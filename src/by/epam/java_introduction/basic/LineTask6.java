package by.epam.java_introduction.basic;

/*
 Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 принадлежит закрашенной области, и false — в противном случае
 */

public class LineTask6 {
    public static void main(String[] args) {
        double x = -4;
        double y = -3;

        boolean set1 = (x >= -2 && x <= 2) && (y >= 0 && x <= 4);
        boolean set2 = (x >= -4 && x <= 4) && (y >= -3 && y <= 0);

        System.out.println(set1 || set2);
    }
}