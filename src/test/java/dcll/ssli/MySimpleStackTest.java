package dcll.ssli;

import junit.framework.TestCase;

public class MySimpleStackTest extends TestCase {

    public void testIsEmpty() throws Exception {
        SimpleStack stack = new MySimpleStack();
        assertTrue(stack.isEmpty());

        stack.push(new Item(new Object()));
        assertFalse(stack.isEmpty());
    }

    public void testGetSize() throws Exception {
        SimpleStack stack = new MySimpleStack();

        assertEquals(stack.getSize(), 0);
    }

    public void testPush() throws Exception {
        SimpleStack stack = new MySimpleStack();
        Item item = new Item(new Object());
        stack.push(item);
    }

    public void testPeek() throws Exception {
        SimpleStack stack = new MySimpleStack();
        Item item = new Item(new Object());
        stack.push(item);

        assertEquals(stack.peek(), item);
    }

    public void testPop() throws Exception {
        SimpleStack stack = new MySimpleStack();
        Item item = new Item(new Object());
        stack.push(item);
        stack.push(item);

        assertEquals(stack.pop(), item);
        assertEquals(stack.getSize(), 1);
        assertFalse(stack.isEmpty());

        assertEquals(stack.pop(), item);
        assertEquals(stack.getSize(), 0);
        assertTrue(stack.isEmpty());
    }
}