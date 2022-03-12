import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class databaseTest {
    @Test
    public void testInitialize() throws FileNotFoundException {
        database a  = new database();
        String[] wordbank = a.wordleList();
        assertEquals(wordbank[1319], "nylon");
        assertEquals(wordbank[0], "aback");
        assertEquals(wordbank[wordbank.length - 1], "zonal");
    }

}
