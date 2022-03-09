import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class database {
    /**
     *  This method iterates through the text file database and initializes an array to contain all the entries
     *
     *  @return wordbank, array of all the words in the database.
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
}
