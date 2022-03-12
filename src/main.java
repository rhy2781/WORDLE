import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        wordleObject a = new wordleObject();
        a.letterIncluded('a');
        a.letterIncluded('c');
        a.letterIncluded('t');
        a.letterIncluded('h');

        a.letterNotIncluded('m');
        a.letterNotIncluded('p');
//        a.letterNotIncluded('l');
        a.letterNotIncluded('e');
        a.letterNotIncluded('n');
        a.letterNotIncluded('d');
        a.letterNotIncluded('y');
        a.letterNotIncluded('b');
        a.letterNotIncluded('s');
        a.letterNotIncluded('i');

        ArrayList<potentialAnswer> result = a.sameWords(".....");
        System.out.println(Arrays.toString(result.toArray()));
        System.out.println(result.size());

    }
}
