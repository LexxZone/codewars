package string;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CamelCaseSolutionTest {

    @Test
    public void testTwoWords() {
        assertEquals("TestCase", CamelCaseSolution.camelCaseOptimal("test case"));
    }

    @Test
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", CamelCaseSolution.camelCaseOptimal("camel case method"));
    }

    @Test
    public void testLeadingSpace() {
        assertEquals("CamelCaseWord", CamelCaseSolution.camelCaseOptimal(" camel case word"));
    }

    @Test
    public void testTrailingSpace() {
        assertEquals("SayHello", CamelCaseSolution.camelCaseOptimal("say hello "));
    }

    @Test
    public void testSingleLetter() {
        assertEquals("Z", CamelCaseSolution.camelCaseOptimal("z"));
    }

    @Test
    public void testTwoSpacesBetweenWords() {
        assertEquals("AbC", CamelCaseSolution.camelCaseOptimal("ab  c"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", CamelCaseSolution.camelCaseOptimal(""));
    }

    @Test
    public void testTwoWords2() {
        assertEquals("TestCase", CamelCaseSolution.camelCase("test case"));
    }

    @Test
    public void testThreeWords2() {
        assertEquals("CamelCaseMethod", CamelCaseSolution.camelCase("camel case method"));
    }

    @Test
    public void testLeadingSpace2() {
        assertEquals("CamelCaseWord", CamelCaseSolution.camelCase(" camel case word"));
    }

    @Test
    public void testTrailingSpace2() {
        assertEquals("SayHello", CamelCaseSolution.camelCase("say hello "));
    }

    @Test
    public void testSingleLetter2() {
        assertEquals("Z", CamelCaseSolution.camelCase("z"));
    }

    @Test
    public void testTwoSpacesBetweenWords2() {
        assertEquals("AbC", CamelCaseSolution.camelCase("ab  c"));
    }

    @Test
    public void testEmptyString2() {
        assertEquals("", CamelCaseSolution.camelCase(""));
    }




}
