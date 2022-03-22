import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        wordleObject a = new wordleObject();
        a.letterIncludedWrongIndex('h', 0);
        a.letterIncludedWrongIndex('h', 1);
        a.letterIncludedWrongIndex('h', 3);
        a.letterIncludedWrongIndex('s', 4);
        a.letterIncluded('s');
        a.letterIncluded('o');

        a.letterNotIncluded('r');
        a.letterNotIncluded('i');
        a.letterNotIncluded('g');
        a.letterNotIncluded('t');
        a.letterNotIncluded('e');
        a.letterNotIncluded('a');
        a.letterNotIncluded('p');
        a.letterNotIncluded('c');
        a.letterNotIncluded('k');






        ArrayList<potentialAnswer> result = a.sameWords("s.o..");
        System.out.println(Arrays.toString(result.toArray()));
        System.out.println(a.confirmed.toString());
        System.out.println(result.size());

    }
}
