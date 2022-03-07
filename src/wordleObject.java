import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class wordleObject {
    HashMap<Character, Boolean> tracker;
    String[] wordbank;

    public static void main(String [] args){
        try {
            wordleObject a = new wordleObject();
            for(String s: a.wordbank){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public wordleObject() throws FileNotFoundException{
        this.tracker = initializeCharacterTracker();
        this.wordbank = wordleList();
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
     *  This method iterates through the text file database and initializes an array to contain all the entries
     */
    public String[] wordleList() throws FileNotFoundException {
        String[] wordbank = new String[2315];
        File wordle = new File("src/wordle.txt");
        Scanner a = new Scanner(wordle);
        int i = 0;
        while (a.hasNextLine()) {
            wordbank[i] = a.nextLine();
            i++;
        }
        return wordbank;
    }
    /**
     *  This method determines if a guess could be a possible word, given the guess, tracker, and potential word.
     */
    public boolean isSame(String s1, String guess, HashMap<Character, Boolean> tracker){
        for(int i = 0; i < s1.length(); i++){
            if(!tracker.get(s1.charAt(i))){
                return false;
            }
            else if(guess.charAt(i) == '.'){
                continue;
            }
            else if(guess.charAt(i) != s1.charAt(i)){
                return false;
            }
        }
        return true;
    }
    /**
     *  This method iterates through the wordle list and generates a list of potential answers based on the letters
     *  that have the correct placement and correct letters.
     */
    public ArrayList<String> sameWords(String[] wordbank, String guess, HashMap<Character, Boolean> tracker) {
        ArrayList<String> same  = new ArrayList<>();
        for (int i = 0; i < wordbank.length; i++) {
            if (isSame(wordbank[i], guess, tracker)) {
                same.add(wordbank[i]);
            }
        }
        return same;
    }
    /**
     *  If a letter is not included we can exclude it from the list of possbilities.
     */
    public void letterNotIncluded(Character c){
        this.tracker.put(c, false);
    }
}
