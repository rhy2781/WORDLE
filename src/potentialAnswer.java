public class potentialAnswer extends potentialAnswerComparator{
    String word;
    int potential;

    public potentialAnswer(String s){
        this.word = s;
        this.potential = 0;
    }
    /**
     *  This method increments potential, which we use to determine it's chances of being the answer.
     */
    public void increasePotential(){
        this.potential ++;
    }
    /**
     *  This method provides the potential.
     */
    public int getPotential(){
        return this.potential;
    }
    /**
     *  This method overrides the standard toString method.
     */
    /
    @Override
    public String toString(){
        return this.word + ": " + this.potential;
    }
}
