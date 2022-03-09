import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class wordleObject {
    HashMap<Character, Boolean> tracker;
    String[] wordbank;

    public wordleObject() throws FileNotFoundException{
        // initialize our character tracker
        this.tracker = initializeCharacterTracker();

        // initialize our database array
        database d = new database();
        this.wordbank = d.wordleList();
    }

    /**
     *  This method initializes our tracker, which we use to determine if a letter is in a word or not
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
     *  This method determines if a guess could be a possible word, given the guess, tracker, and potential word.
     */
    public boolean isSame(String s1, String guess, HashMap<Character, Boolean> tracker){
        for(int i = 0; i < s1.length(); i++){
            if(!tracker.get(s1.charAt(i))) {
                if (!tracker.get(s1.charAt(i))) { // if we find a letter that is not included in the tracker
                    return false;
                }
            }
            else if(guess.charAt(i) == '.'){ // if our letter is a '.' then we continue=
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
     */
    public ArrayList<potentialAnswer> sameWords(String[] wordbank, String guess, HashMap<Character, Boolean> tracker) {
        ArrayList<potentialAnswer> same  = new ArrayList<>();
        for (int i = 0; i < wordbank.length; i++) {
            if (isSame(wordbank[i], guess, tracker)) {
                same.add(calculatePotential(wordbank[i], tracker));
            }
        }
        return same;
    }
    public potentialAnswer calculatePotential(String s, HashMap<Character, Boolean> tracker){
        potentialAnswer result = new potentialAnswer(s);
        for(int i = 0; i < s.length(); i++){
            if(tracker.get(s.charAt(i))){
                result.increasePotential();
            }
        }
        return result;
    }

    /**
     *  If a letter is not included we can exclude it from the list of possbilities.
     */
    public void letterNotIncluded(Character c){
        this.tracker.put(c, false);
    }

    /**
     *  If a letter is included, then we take note of it and account for it being a more likely answer
     */
    public void letterIncluded(Character c){
        this.tracker.put(c, true);
    }
}
