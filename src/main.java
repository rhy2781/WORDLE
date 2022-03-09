import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        wordleObject a = new wordleObject();
        a.letterIncluded('w');
        a.letterIncluded('e');

        a.letterNotIncluded('r');
        a.letterNotIncluded('c');
        a.letterNotIncluded('k');


        ArrayList<potentialAnswer> result = a.sameWords("..e..");
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
