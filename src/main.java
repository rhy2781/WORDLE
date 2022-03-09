import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
//        wordleObject a = new wordleObject();
//        a.letterIncluded('r');
//        a.letterIncluded('o');
//
//        a.letterNotIncluded('t');
//        a.letterNotIncluded('i');
//        a.letterNotIncluded('c');
//        a.letterNotIncluded('k');
//        a.letterNotIncluded('p');
//        a.letterNotIncluded('s');
//        a.letterNotIncluded('e');
//
//        ArrayList<potentialAnswer> result = a.sameWords(a.wordbank, ".o...", a.tracker);
//        System.out.println(Arrays.toString(result.toArray()));

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




    }
}
