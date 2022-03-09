import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        wordleObject a = new wordleObject();
        a.letterIncluded('t');
        a.letterIncluded('h');

//        a.letterIncluded('e');

        a.letterNotIncluded('r');
        a.letterNotIncluded('e');
        a.letterNotIncluded('a');
        a.letterNotIncluded('d');
        a.letterNotIncluded('s');
        a.letterNotIncluded('i');
        a.letterNotIncluded('l');
        a.letterNotIncluded('b');
        a.letterNotIncluded('u');
        a.letterNotIncluded('c');




        ArrayList<potentialAnswer> result = a.sameWords("....h");
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
