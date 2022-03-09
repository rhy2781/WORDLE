import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class wordleObject {
    HashMap<Character, Boolean> tracker;
    String[] wordbank;
    HashSet<Character> confirmed;
    potentialAnswerComparator comparator;

    public wordleObject() throws FileNotFoundException{
        // initialize our character tracker
        this.tracker = initializeCharacterTracker();
        // initialize our database array
        database d = new database();
        this.wordbank = d.wordleList();

        // initialized a set to contain the confirmed letter to be a part of the word
        this.confirmed = new HashSet<>();

        //comparator used to sort results
        this.comparator = new potentialAnswerComparator();
    }

    /**
     *  This method initializes our tracker, which we use to determine if a letter is in a word or not
     *  We mainly use this to track when a letter is confirmed not to be a part of the word
     *
     *  @return Hashmap with alphabetical characters mapped to boolean values indicating being part of the word
     */
    public HashMap<Character, Boolean> initializeCharacterTracker(){
        this.tracker = new HashMap<>();
        char a = 'a';
        for(int i = 0; i < 26; i++){
            tracker.put(a, true);
            a = (char)((int) a + 1);
        }
        tracker.put('.', true);
        return tracker;
    }

    /**
     *  This method determines if a guess could be a possible word, given the potential word and the guess
     *
     *  @return boolean value indicating if string s1 is a possible word for the given guess
     */
    public boolean isSame(String s1, String guess){
        for(int i = 0; i < s1.length(); i++){
            if (!tracker.get(s1.charAt(i))) { // if we find a letter that is not included in the tracker
                return false;
            }
            else if(guess.charAt(i) == '.'){ // if our letter is a '.' then we continue
                continue;
            }
            else if(guess.charAt(i) != s1.charAt(i)){ // if a letter found does not match the given string, return
                return false;
            }
        }
        return true;
    }

    /**
     *  This method iterates through the wordle list and generates a list of potential answers based on the letters
     *  that have the correct placement and correct letters.
     *
     *  @param guess, String that indicates the letters that are found to be in the correct place.
     *  @return ArrayList of potentialAnswers
     */
    public ArrayList<potentialAnswer> sameWords(String guess) {
        ArrayList<potentialAnswer> same  = new ArrayList<>();
        for (String s : wordbank) {
            if (isSame(s, guess)) {
                same.add(calculatePotential(s));
            }
        }
        same.sort(comparator);
        return same;
    }

    /**
     *  This method calculates the potential of a word by checking is a letter is contained in the confirmed Set
     * @param s, String to determine the potential of
     * @return result, potentialAnswer object containing the updated count
     */
    public potentialAnswer calculatePotential(String s){
        potentialAnswer result = new potentialAnswer(s);
        for(int i = 0; i < s.length(); i++){
            if(confirmed.contains(s.charAt(i))){
                result.increasePotential();
            }
        }
        return result;
    }

    /**
     *  If a letter is not included we can exclude it from the list of possbilities.
     *  @param c letter to be marked
     */
    public void letterNotIncluded(Character c){
        this.tracker.put(c, false);
    }

    /**
     *  If a letter is included, then we take note of it and account for it being a more likely answer
     *  @param c letter to be marked
     */
    public void letterIncluded(Character c){
        this.confirmed.add(c);  // add the letter to our confirmed set
    }
}
