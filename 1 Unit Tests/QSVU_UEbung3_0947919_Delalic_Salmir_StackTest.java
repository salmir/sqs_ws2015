import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;
import java.util.Stack;
import static  org.junit.Assert.*;

public class QSVU_UEbung3_0947919_Delalic_Salmir_StackTest {

    protected Stack stack;

    @Before
    public void setUp() {
        stack = new Stack<>();
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testGetFromEmptyStackThrowsException() {
        assertEquals(null, stack.get(5));
    }

    @Test
    public void testEmptyStackSizeIs0() {
        assertEquals(0,stack.size());
    }

    @Test
    public void testStackEmptyWithMethod() {
        assertTrue(stack.empty());
    }

    @Test
    public void testSizeOfStackAfterPush() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3,stack.size());
    }

    @Test
    public void testStackMustNotBeEmptyAfterPush() {
        stack.push(1);
        stack.push(2);
        assertFalse(stack.empty());
    }

    @Test
    public void testIfSizeGrowWithPush() {
        int emptySize = stack.size();
        stack.push(1234);
        int sizeAfterFirstPush = stack.size();
        assertTrue(emptySize < sizeAfterFirstPush);

        stack.push(5678);
        int sizeAfterSecondPush = stack.size();
        assertTrue(sizeAfterFirstPush < sizeAfterSecondPush);
    }

    @Test (expected = EmptyStackException.class)
    public void youCantPullMoreThanYouDidPush() throws Exception {
        assertTrue(stack.empty());

        stack.push(1);
        stack.push(2);

        assertFalse(stack.empty());
        assertEquals(2, stack.size());

        stack.pop();
        stack.pop();

        assertTrue(stack.empty());

        stack.pop();
        throw new Exception("should never reach here");
    }

    @Test
    public void testTheMessagePop() {
        assertTrue(stack.empty());
        String anImportantMessage = "important Message";

        stack.push(anImportantMessage);
        assertFalse(stack.empty());

        String unknownMessage = (String) stack.pop();

        assertEquals(anImportantMessage, unknownMessage);
    }

    @Test
    public void testHowToCount() {
        assertTrue(stack.empty());

        String one = "1";
        String two = "2";
        String three = "3";

        stack.push(one);
        stack.push(two);
        stack.push(three);

        assertEquals(3, stack.size());

        String countBackward = "321";
        String countForward = "123";

        String output = "";
        output += stack.pop();
        output += stack.pop();
        output += stack.pop();

        assertTrue(output.equals(countBackward));
        assertFalse(output.equals(countForward));
    }

    @Test
    public void kingOfTheHill() {
        assertTrue(stack.empty());

        String one = "1";
        String two = "2";
        String three = "3";
        String output = "";

        stack.push(one);
        stack.push(two);
        stack.push(three);

        assertEquals(3, stack.size());
        //peek should be anytime the last push
        assertEquals(three, stack.peek());

        output += stack.pop();
        assertEquals(two, stack.peek());

        output += stack.pop();
        assertEquals(one, stack.peek());
        assertTrue(stack.size() > 0);

        assertEquals("32", output);

        output += stack.pop();
        assertEquals("321", output);
    }
}