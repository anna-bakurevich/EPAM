package by.epam.java_introduction.string;
/*
Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
public class StringArray1 {
    public static void main(String[] args) {
        String[] vars = {"userFirstName", "userLastName", "userPhone", "userAge"};
        printArray(vars);
        for (int i = 0; i < vars.length; i++) {
            vars[i] = toSnakeCase(vars[i]);
        }
        printArray(vars);
    }
    public static void printArray(String[] array){
        for (String s:array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static String toSnakeCase(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);

        for (int i = 0; i < stringBuilder.length(); i++) {
            char ch = stringBuilder.charAt(i);
            if (Character.isUpperCase(ch)) {
                Character.toLowerCase(ch);
                stringBuilder.insert(i, "_");
                i++;
                stringBuilder.setLength(stringBuilder.length() + 1);
            }
        }
        s = stringBuilder.toString();
        return s;
    }
}
