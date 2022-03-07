public class potentialAnswer {
    String word;
    int potential;
    public potentialAnswer(String s){
        this.word = s;
        this.potential = 0;
    }
    public void increasePotential(){
        this.potential ++;
    }
    @Override
    public String toString(){
        return this.word + ": " + this.potential;
    }
}
