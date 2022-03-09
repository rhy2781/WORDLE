import java.util.Comparator;

public class potentialAnswerComparator implements Comparator<potentialAnswer> {
    /**
     *  This method provides a comparison between two potential answers based on their potential count.
     *  This comparison is used to sort the two potentials from greatest to least.
     */
    @Override
    public int compare(potentialAnswer a1, potentialAnswer a2) {
        return Integer.compare(a2.getPotential(), a1.getPotential());
    }
}
