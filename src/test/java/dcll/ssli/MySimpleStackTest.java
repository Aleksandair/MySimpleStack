package dcll.ssli;

import junit.framework.TestCase;
import org.junit.*;

public class MySimpleStackTest {

    SimpleStack stack;

    @Before
    public void setUp() throws Exception {
        stack = new MySimpleStack();
        System.out.println("Je suis exécuté avant chaque test.");
    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertTrue(stack.isEmpty());

        Item item = new Item(new String("toto"));
        stack.push(item);
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        Assert.assertEquals(stack.getSize(), 0);

        Item item = new Item(new Integer(5));
        Item item1 = new Item(new Integer(8));
        stack.push(item);
        stack.push(item1);
        Assert.assertEquals(stack.getSize(), 2);

        Item item2 = stack.peek();
        Assert.assertTrue(item2.getValue() instanceof Integer);
    }

    @Test
    public void testPush() throws Exception {
        Item item = new Item(new String("toto"));

    }

    @Test
    public void testPeek() throws Exception {
        Item item = new Item(new Integer(8));
        stack.push(item);
        Assert.assertEquals(stack.getSize(), 1);
        Assert.assertEquals(stack.peek(), item);
    }

    @Test
    public void testPop() throws Exception {
        Item item = new Item(new Integer(8));
        Assert.assertEquals(stack.getSize(), 0);
        stack.push(item);
        Assert.assertEquals(stack.getSize(), 1);
        Item o = stack.pop();
        Assert.assertEquals(stack.getSize(), 0);
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(item.getValue(), integer);
    }
}