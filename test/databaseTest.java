import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class databaseTest {

    private String[] wordbank;

    @BeforeEach
    public void init() throws FileNotFoundException {
        database a  = new database();
        wordbank = a.wordleList();
    }

    @Test
    public void testInitialize() throws FileNotFoundException {
        assertNotNull(wordbank, "Wordbank is not initialized properly");
    }

    @Test
    public void testEntries(){
        assertEquals(wordbank[0], "aback", "First entry is not correct");
        assertEquals(wordbank[1319], "nylon", "Entry in the middle is not correct");
        assertEquals(wordbank[wordbank.length - 1], "zonal", " Last Entry is not correct");
    }

}
