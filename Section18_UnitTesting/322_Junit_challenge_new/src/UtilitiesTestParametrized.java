import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParametrized {
    private Utilities utilities;
    private String input;
    private String output;


    public UtilitiesTestParametrized(String input, String output) {
        this.input = input;
        this.output = output;
    }
    @org.junit.Before
public void setup(){
        utilities = new Utilities();
}
@Parameterized.Parameters
    public static Collection<Object> testConditions(){
        return Arrays.asList(new Object[] [] {
                {"AABBCCDEFF", "ABCDEF"},
                {"ABCCABDEEFF", "ABCABDEF"},
                {"112222333555588999","123589"},
                {"A","A"}

        });
    }

    @org.junit.Test
    public void removePairs() throws Exception{
        assertEquals(output,utilities.removePairs(input));
    }
}
