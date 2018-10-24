package string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetMiddleCharacterTest {

    @Test
    public void evenTests() {
        assertEquals("es", GetMiddleCharacter.getMiddle("test"));
        assertEquals("dd", GetMiddleCharacter.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", GetMiddleCharacter.getMiddle("testing"));
        assertEquals("A", GetMiddleCharacter.getMiddle("A"));
    }
}



