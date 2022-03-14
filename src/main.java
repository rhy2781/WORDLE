import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        wordleObject a = new wordleObject();
        a.letterIncludedWrongIndex('s', 4);
        a.letterIncludedWrongIndex('s', 3);
        a.letterIncluded('e');
        a.letterIncluded('l');
//        a.letterIncluded('h');

        a.letterNotIncluded('f');
        a.letterNotIncluded('o');
        a.letterNotIncluded('u');
        a.letterNotIncluded('c');
        a.letterNotIncluded('b');
        a.letterNotIncluded('r');
        a.letterNotIncluded('a');
        a.letterNotIncluded('g');
        a.letterNotIncluded('y');
        a.letterNotIncluded('p');
        a.letterNotIncluded('i');
        a.letterNotIncluded('z');
        a.letterNotIncluded('w');



        ArrayList<potentialAnswer> result = a.sameWords("sle.t");
        System.out.println(Arrays.toString(result.toArray()));
        System.out.println(a.confirmed.toString());
        System.out.println(result.size());

    }
}
