import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class wordlelogic{
    public static void main(String[] args) {
        try {
            String[] wordle = wordleList();
            ArrayList<String> same = sameWords(wordle, "vi...");
            System.out.println(same.toString());


//            System.out.println(isSame("vivid",".i.i."));



//            String[] same = hasSameLetters(wordle, "vivid");
//            System.out.println(Arrays.toString(same));
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

    static boolean isSame(String s1, String guess){
        for(int i = 0; i < s1.length(); i++){
            if(guess.charAt(i) == '.'){
                i++;
            }
            else if(guess.charAt(i) != s1.charAt(i)){
                return false;
            }
        }
        return true;
    }
    static ArrayList<String> sameWords(String[] wordbank, String guess){
        ArrayList<String> same = new ArrayList<>();
        for(int i = 0; i < wordbank.length; i++){
            if (isSame(wordbank[i], guess)){
                same.add(wordbank[i]);
            }
        }
        return same;
    }

}
