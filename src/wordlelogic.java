import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class wordlelogic{
//    HashMap<Character, Boolean> tracker;
//    String[] wordle;
//
//    public wordlelogic() throws FileNotFoundException {
//        this.tracker = initializeCharacterTracker();
//        this.wordle = wordleList();
//
//    }

    public static void main(String[] args) {
        try {
            HashMap<Character, Boolean> tracker = initializeCharacterTracker();
            tracker.put('f', false);
            tracker.put('r', false);
            tracker.put('e', false);
            tracker.put('y', false);


            String[] wordle = wordleList();
//            System.out.println(isSame("spine", "spi..", tracker));


            ArrayList<String> same = sameWords(wordle, "spi..", tracker);
            System.out.println(same.toString());

//            System.out.println(tracker.get('z'));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static String[] wordleList() throws FileNotFoundException {
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
    static boolean isSame(String s1, String guess, HashMap<Character, Boolean> tracker){
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
    static ArrayList<String> sameWords(String[] wordbank, String guess, HashMap<Character, Boolean> tracker) {
        ArrayList<String> same  = new ArrayList<>();
        for (int i = 0; i < wordbank.length; i++) {
            if (isSame(wordbank[i], guess, tracker)) {
                same.add(wordbank[i]);
            }
        }
        return same;
    }
    static HashMap<Character, Boolean> initializeCharacterTracker(){
        HashMap<Character, Boolean> tracker = new HashMap<>();
        char a = 'a';
        for(int i = 0; i < 26; i++){
            tracker.put(a, true);
            a = (char)((int) a + 1);
        }
        tracker.put('.', true);
        return tracker;
    }
}
