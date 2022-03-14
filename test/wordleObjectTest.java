import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class wordleObjectTest {

    wordleObject a;

    @BeforeAll
    public void init() throws FileNotFoundException {
        a = new wordleObject();
    }

    @Test
    public void TestLetterIncludedWrongIndex(){
        a.letterIncludedWrongIndex('s', 5);


    }
}
