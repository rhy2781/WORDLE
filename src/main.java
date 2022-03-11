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
        a.letterNotIncluded('l');
        a.letterNotIncluded('e');
        a.letterNotIncluded('n');
        a.letterNotIncluded('d');
        a.letterNotIncluded('y');
        a.letterNotIncluded('b');
        a.letterNotIncluded('s');
        a.letterNotIncluded('i');
        a.letterNotIncluded('h');




        ArrayList<potentialAnswer> result = a.sameWords(".a...");
        System.out.println(Arrays.toString(result.toArray()));

        /**
         *
         * Comparator tests
        potentialAnswer a = new potentialAnswer("think");
        a.increasePotential();
        a.increasePotential();
        a.increasePotential();

        potentialAnswer b = new potentialAnswer("sting");
        b.increasePotential();
        b.increasePotential();

        potentialAnswerComparator compare = new potentialAnswerComparator();

        ArrayList<potentialAnswer> list = new ArrayList<>();
        list.add(a);
        list.add(b);

        list.sort(compare);

        System.out.println(Arrays.toString(list.toArray()));
         */




    }
}
