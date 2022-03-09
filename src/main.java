import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        wordleObject a = new wordleObject();
        a.letterIncluded('r');
        a.letterIncluded('o');

        a.letterNotIncluded('t');
        a.letterNotIncluded('i');
        a.letterNotIncluded('c');
        a.letterNotIncluded('k');
        a.letterNotIncluded('p');
        a.letterNotIncluded('s');
        a.letterNotIncluded('e');

        ArrayList<potentialAnswer> result = a.sameWords(a.wordbank, ".o...", a.tracker);
        System.out.println(Arrays.toString(result.toArray()));



    }
}
