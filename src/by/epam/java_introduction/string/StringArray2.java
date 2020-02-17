package by.epam.java_introduction.string;

/*
Замените в строке все вхождения 'word' на 'letter'.
 */
public class StringArray2 {
    public static void main(String[] args) {
        String s = "Word, words, letter, word";
        System.out.println(changeWord(s));
    }

    public static String changeWord(String s) {
        return s.replace("word", "letter");
    }
}
