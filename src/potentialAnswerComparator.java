import java.util.Comparator;

public class potentialAnswerComparator implements Comparator<potentialAnswer> {
    @Override
    public int compare(potentialAnswer a1, potentialAnswer a2) {
        return Integer.compare(a2.getPotential(), a1.getPotential());
    }

}
