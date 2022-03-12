import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class potentialAnswerTest {

    private potentialAnswer test;

    @BeforeEach
    public void init(){
        test = new potentialAnswer("string");
    }

    @Test
    public void getPotentialTest(){
        assertEquals(0, test.getPotential(), "Initial potential is not set correctly");
    }

    @Test
    public void test(){
        test.increasePotential();
        assertEquals(1, test.getPotential(), "Increase potential method is not working");
    }
    @Test
    public void testToString(){
        assertEquals("string: 0", test.toString(), "Class is not printing string correctly");
    }
}
