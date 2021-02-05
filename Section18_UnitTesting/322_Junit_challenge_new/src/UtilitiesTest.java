import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtilitiesTest {
private Utilities utilities;

@org.junit.Before
public void setup() {
    utilities = new Utilities();
}

    @Test
    public void everyNthChar() {
        char [] output = utilities.everyNthChar(new char [] {'h','e','l','l','o'},2);
        assertArrayEquals(new char[] {'e', 'l'}, output);
        char [] output2 = utilities.everyNthChar(new char [] {'h','e','l','l','o'},8);
        assertArrayEquals(new char[] {'h','e','l','l','o'}, output2);
    }

    @Test
    public void removePairs() {
        assertEquals("ABCDEF", utilities.removePairs("AABBCCDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEFF"));
        assertNull(null, utilities.removePairs(null));
        assertEquals("A",utilities.removePairs("A"));
        assertEquals("",utilities.removePairs(""));

    }

    @Test
    public void converter() throws Exception {
        assertEquals(300,utilities.converter(10,5));
    }
     @org.junit.Test(expected = ArithmeticException.class)
     public void converter_arithmeticException() throws Exception{
        Utilities utilities = new Utilities();
        utilities.converter(10,0);
    }

    @Test
    public void nullIfOddLength() {
      assertNull(utilities.nullIfOddLength("odd"));
      assertNotNull(utilities.nullIfOddLength("even"));
    }
}